package com.ll.card.util;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionUtils {
	public static int connectTimeout = 5000;
	public static int readTimeout = 5000;

	public static InputStream get(String urlS){
		try {
			URL url = new URL(urlS);
			HttpURLConnection  connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			int state = connection.getResponseCode();
			connection.setConnectTimeout(connectTimeout);
			connection.setReadTimeout(readTimeout);
			if(state==200){
				return connection.getInputStream();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
