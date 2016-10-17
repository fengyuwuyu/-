package com.ll.card;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.ll.card.util.HttpUrlConnectionUtils;

public class QueryActivity extends Activity {

	private EditText et;
	private Button btn;
	private final int SHOW = 1;
	private final int ERROR = 2;
	private final int SUCCESS = 3;
	private final int FAIL = 4;
	private ListView lv;
	private Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			if (msg.what == SHOW) {
				List<Map<String, Object>> users = (List<Map<String, Object>>) msg.obj;
				if (users != null && users.size() > 0) {
					String from[] = { "userSerial", "userLname","privilege", "userDepname",
							"company" };
					int to[] = { R.id.userSerial, R.id.userLname,R.id.privilege,
							R.id.userDepname, R.id.company };
					lv.setAdapter(new SimpleAdapter(QueryActivity.this, users,
							R.layout.lv_item, from, to));
				} else {
					Toast toast = Toast.makeText(QueryActivity.this, "不存在此员工！",
							Toast.LENGTH_LONG);
					toast.show();
				}
			}else {
				String message = (String) msg.obj;
				Toast toast = Toast.makeText(QueryActivity.this, message,
						Toast.LENGTH_LONG);
				toast.show();
			}
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_query);
		et = (EditText) findViewById(R.id.query_et);
		lv = (ListView) findViewById(R.id.lv);
		btn = (Button) findViewById(R.id.query_btn);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String username = et.getText().toString().trim();
				final String name = URLEncoder.encode(username);
				if (username != null && !"".equals(username)) {
					new Thread(new Runnable() {

						@Override
						public void run() {
							try {
								
								InputStream is = HttpUrlConnectionUtils
										.get(MainActivity.URL+"main/androidQuery.do?username="+name);
								if (is != null) {
									String result = IOUtils.toString(is);
									Log.d("MainActivity", result);
									JSONObject jsonObject = new JSONObject(result);
									boolean success = (Boolean) jsonObject
											.get("success");
									if (success) {
										JSONArray jsonArray = jsonObject.getJSONArray("users");
										if (jsonArray != null) {
											List<Map<String,Object>> users = new ArrayList<Map<String,Object>>();
											for(int i=0;i<jsonArray.length();i++){
												Map<String,Object> map = new HashMap<String, Object>();
												JSONObject user =  jsonArray.getJSONObject(i);
												map.put("userSerial",user.get("user_serial"));
												map.put("userLname", user.get("user_lname"));
												map.put("userDepname",user.get("user_depname"));
												map.put("company", user.getString("company"));
												map.put("privilege", user.getString("privilege"));
												users.add(map);
											}
											Message message = new Message();
											message.what = SHOW;
											message.obj = users;
											handler.sendMessage(message);
										}
									} else {
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
								Message message = new Message();
								message.what = ERROR;
								message.obj = "调用服务器接口失败，请重新尝试或联系管理员！";
								handler.sendMessage(message);
							}
						}
					}).start();
				}
			}
		});
		et.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openKeyBoard();
			}
		});
		et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				Log.i("Query",hasFocus+"");
				if(hasFocus){
					openKeyBoard();
				}else{
					closeKeyBoard();
				}
			}
		});
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				TextView userSerial = (TextView) view.findViewById(R.id.userSerial);
				dialog(userSerial.getText().toString());
			}
		});
	}
	
	private void dialog(final String userSerial) {
		if(userSerial==null||"".equals(userSerial)){
			return ;
		}
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("确认开通就餐权限吗？");
		builder.setTitle("提示");
		builder.setPositiveButton("确认", new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						try {
							InputStream is = HttpUrlConnectionUtils
									.get(MainActivity.URL+"Card/main/updatePrivilege.do?userSerial="+userSerial);
							if (is != null) {
								String result = IOUtils.toString(is);
								Log.d("MainActivity", result);
								JSONObject jsonObject = new JSONObject(result);
								boolean success = (Boolean) jsonObject
										.get("success");
								if (success) {
										Message message = new Message();
										message.what = SUCCESS;
										message.obj = "开通成功！";
										handler.sendMessage(message);
								} else {
									Message message = new Message();
									message.what = FAIL;
									message.obj = "调用服务器接口失败，请重新尝试或联系管理员！";
									handler.sendMessage(message);
								}
								is.close();
							}
						} catch (Exception e) {
							e.printStackTrace();
							Message message = new Message();
							message.what = 2;
							message.obj = "调用服务器接口失败，请重新尝试或联系管理员！";
							handler.sendMessage(message);
						}
					}
				}).start();
			}
		});
		builder.setNegativeButton("取消", new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		builder.create().show();
	}

	private void openKeyBoard() {  
		  
	     Timer timer = new Timer();  
	     timer.schedule(new TimerTask() {  
	             @Override  
	             public void run() {  
	                     InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);  
	                     imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);  
	  
	             }  
	     }, 500);  
	}  
	 //关闭软键盘  
	 private void closeKeyBoard() {  
	     InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);  
	     imm.hideSoftInputFromWindow(et.getWindowToken(), 0);  
	}  

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
