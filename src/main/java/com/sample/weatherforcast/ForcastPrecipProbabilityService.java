package com.sample.weatherforcast;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sample.common.Constants;
import com.sample.darkskyapi.dto.Currently;
import com.sample.darkskyapi.dto.WeatherForcastDto;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ForcastPrecipProbabilityService {
	private String kedo = "35.6138";
	private String ido = "139.7256";
	private OkHttpClient httpClient;
	
	public String getTodayPrecipProbability() throws JsonProcessingException {
		System.out.println("MYLOG: start getTodayPrecipProbability()");
		WeatherForcastDto dto = getWeatherData();
		String precipProbability = calculateMaxProbability(dto);
		System.out.println("MYLOG: end getTodayPrecipProbability() prob is " + precipProbability);
		return precipProbability;
	}
	
	private WeatherForcastDto getWeatherData() {
		Request request = 
				new Request.Builder().url(Constants.darkskyApiPrefixUrl
				+ Constants.darkskyApiSecretKey + "/"+ this.kedo +", " + this.ido).build();
		WeatherForcastDto responseData = null;
		try {
			httpClient = OkHttpClientSingleton.getInstance().createHttpClient();
			Response response = httpClient.newCall(request).execute();
			String responseJson = response.body().string();
			responseData = JsonConverterUtil.fromJsonString(responseJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return responseData;
	}

	private String calculateMaxProbability(WeatherForcastDto dto) {
		double maxPrecipProbability = 0.00;
		Currently[] hourWeather = dto.getHourly().getData();
		Calendar calendar = Calendar.getInstance();
		
		int startPoint = 0;
		int endPoint = 0;
		
		// 検索範囲の設定
		if(calendar.get(Calendar.HOUR_OF_DAY) < Constants.startWorkHour) {
			startPoint = Constants.startWorkHour - calendar.get(Calendar.HOUR_OF_DAY);
			endPoint = Constants.overtime - calendar.get(Calendar.HOUR_OF_DAY);
		} else if(calendar.get(Calendar.HOUR_OF_DAY) < Constants.overtime) {
			endPoint = Constants.overtime - calendar.get(Calendar.HOUR_OF_DAY);
		}
		System.out.println("現在時間：" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("検索範囲：" + startPoint + "~" + endPoint);
		
		for(int i = 0;i < 24; i++) {
			System.out.println("time is:" + new Date(hourWeather[i].getTime() * 1000));
			if(i >= startPoint && i <= endPoint) {
				System.out.println(i +" prob is:" + hourWeather[i].getPrecipProbability());
				if(hourWeather[i].getPrecipProbability() > maxPrecipProbability) {
					System.out.println("max is changed to " + hourWeather[i].getPrecipProbability());
					maxPrecipProbability = hourWeather[i].getPrecipProbability();
				}
			}
		}
		int rate = (int) (100 * maxPrecipProbability);
		return Integer.toString(rate);
	}

	public String getTracePrecipProbability(StringBuilder builder) {
		System.out.println("MYLOG: start getTracePrecipProbability()");
		WeatherForcastDto dto = getWeatherData();
		Currently[] hourWeather = dto.getHourly().getData();
		for(int i = 0;i < 24; i++) {
			builder.append(i +" prob is:" + Integer.toString((int)(100 * hourWeather[i].getPrecipProbability())) + "\n");
		}
		System.out.println("MYLOG: end getTracePrecipProbability() prob is " + builder.toString());
		return builder.toString();
	}
	
	@Test //動作検証用メソッド
	public void testtsat() throws JsonProcessingException {
		System.out.println("Wao!!");
		System.out.println(getTodayPrecipProbability());
	}
}
