package com.sample.rainforcast;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sample.rainforcast.dto.RainForcastDto;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RainfallForcastHttpClient {
	
	// TODO change singleTon
	public RainfallForcastHttpClient() {}
	
	public String getTodayPrecipProbability() throws JsonProcessingException {
		RainForcastDto dto = getRainRate();
		int rate = (int) (100 * dto.getDaily().getData()[0].getPrecipProbability());
		return Integer.toString(rate);
	}
	
	private RainForcastDto getRainRate() {
		OkHttpClient.Builder builder = new OkHttpClient.Builder();
		OkHttpClient client = builder.build();
		Request request = new Request.Builder().url("https://api.darksky.net/forecast/18f9443e488e62e7c55ad8d85117be1a/35.6138, 139.7256").build();
		Response response = null;
		String responseJson = null;
		RainForcastDto responseData = null;
		try {
			response = client.newCall(request).execute();
			responseJson = response.body().string();
			responseData = JsonConverterUtil.fromJsonString(responseJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return responseData;
	}
	
//	@Test //動作検証用メソッド
//	public void testtsat() throws JsonProcessingException {
//		System.out.println("Wao!!");
//		System.out.println(getTodayPrecipProbability());
//	}


}
