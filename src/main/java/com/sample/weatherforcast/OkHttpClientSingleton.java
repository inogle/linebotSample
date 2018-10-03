package com.sample.weatherforcast;

import okhttp3.OkHttpClient;

public class OkHttpClientSingleton {

	private static OkHttpClientSingleton instance = new OkHttpClientSingleton();
	private OkHttpClient httpClient;
	
    private OkHttpClientSingleton() {
        this.httpClient = new OkHttpClient.Builder().build();
    }
    
    /**
     * このクラスのインスタンスを取得します。
     * 
     * @return このクラスのインスタンス。
     */
    public static OkHttpClientSingleton getInstance() {
        return instance;
    }
    
    /**
     * OkHttpClient を返します。
     * 
     * @return OkHttpClient のインスタンス。
     */
    public OkHttpClient createHttpClient() {
        return httpClient;
    }
}
