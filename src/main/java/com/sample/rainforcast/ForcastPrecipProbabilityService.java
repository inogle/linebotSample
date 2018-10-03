package com.sample.rainforcast;

import java.io.IOException;

//import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sample.rainforcast.dto.Currently;
import com.sample.rainforcast.dto.RainForcastDto;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ForcastPrecipProbabilityService {
	// TODO 定数クラスに移行
	private String darkskyApiSecretKey = "18f9443e488e62e7c55ad8d85117be1a";
	private String kedo = "35.6138";
	private String ido = "139.7256";
	
	private OkHttpClient client;
	
	public void createHttpClient() {
		if(client == null) {
			this.client = new OkHttpClient.Builder().build();
		}
	}
	
	public String getTodayPrecipProbability() throws JsonProcessingException {
		RainForcastDto dto = getRainRate();
		double maxPrecipProbability = 0;
		Currently[] hourWeather = dto.getHourly().getData();
		for(int i = 0;i < hourWeather.length; i++) {
			if(i > 6 && i < 23) {
				if(hourWeather[i].getPrecipProbability() > maxPrecipProbability) {
					maxPrecipProbability = hourWeather[i].getPrecipProbability();
				}
			}
		}
		int rate = (int) (100 * maxPrecipProbability);
		return Integer.toString(rate);
	}
	
	private RainForcastDto getRainRate() {
		createHttpClient();
		Request request = new Request.Builder().url("https://api.darksky.net/forecast/" + this.darkskyApiSecretKey + "/"+ this.kedo +", " + this.ido).build();
		RainForcastDto responseData = null;
		try {
			Response response = this.client.newCall(request).execute();
			String responseJson = response.body().string();
			// System.out.println("MY_LOG: get json is " + responseJson);
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
