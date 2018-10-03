package com.sample.linebot;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;
import com.sample.common.Constants;

public class LineMessagingClientSingleton {

	private static LineMessagingClientSingleton instance = new LineMessagingClientSingleton();
	private LineMessagingClient client;
	
	private LineMessagingClientSingleton() {
		this.client = new LineMessagingClientBuilder(Constants.lineApiSecretKey).build();
	}
	
    /**
     * このクラスのインスタンスを取得します。
     * 
     * @return このクラスのインスタンス。
     */
	public static LineMessagingClientSingleton getInstance() {
		return instance;
	}

    /**
     * LineMessagingClient を返します。
     * 
     * @return LineMessagingClient のインスタンス。
     */
	LineMessagingClient createLineMessagingClient() {
		return this.client;
	}
	
}
