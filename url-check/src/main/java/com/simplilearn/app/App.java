package com.simplilearn.app;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class App{

	public static String checkResponse(String url) throws IOException{

	HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	
connection.setRequestMethod("HEAD");
	int responseCode = connection.getResponseCode();
	String response = "Success";
	if (responseCode != 200) {
    	response = "Failed";
	}
	return response;
	}

	public static void main(String[] args) throws IOException{
  	System.out.println(checkResponse("https:/"+"/samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"));
	}

}
