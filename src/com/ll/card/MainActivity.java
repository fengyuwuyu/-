package com.ll.card;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ll.card.util.HttpUrlConnectionUtils;

public class MainActivity extends Activity {
	
	public static final String URL = "http://192.168.0.112:8080/Card/";
	
	private EditText uEdit;
	private EditText pEdit;
	private Button btn;
	private final int SHOW = 1;
	private Handler handler = new Handler(){

		@Override
		public void handleMessage(Message msg) {
			if(msg.what==SHOW){
				Toast toast = Toast.makeText(MainActivity.this, (String)msg.obj, Toast.LENGTH_LONG);
				toast.show();
			}
		}
		
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		uEdit = (EditText) findViewById(R.id.editText1);
		pEdit = (EditText) findViewById(R.id.editText2);
		btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final String username = uEdit.getText().toString();
				final String password = pEdit.getText().toString();
				if(username==null||"".equals(username.trim())||password==null||"".equals(password.trim())){
					Toast toast = Toast.makeText(MainActivity.this, R.string.input_error, Toast.LENGTH_LONG);
					toast.show();
					return;
				}
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
								InputStream is = HttpUrlConnectionUtils.get(URL+"main/login.do?userNo=30000123&isAndroid=true&loginid="+username+"&userPassword="+password);
								if(is!=null){
									String result = IOUtils.toString(is);
									Log.d("MainActivity", result);
									JSONObject jsonObject = new JSONObject(result);
									boolean success = (Boolean) jsonObject.get("success");
									if(success){
										Intent intent = new Intent(MainActivity.this,QueryActivity.class);
										startActivity(intent);
									}else{
										Message message = new Message();
										message.what = SHOW;
										String msg = (String) jsonObject.get("msg");
										message.obj = msg;
										handler.sendMessage(message);
									}
									is.close();
								}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
