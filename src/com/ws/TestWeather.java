package com.ws;

public class TestWeather {
	/**
	* 测试
	*/
	public static void main(String[] args) throws Exception {
		WeatherUtil weath=new WeatherUtil();
		
		//查看城市：贵阳
		String weather=weath.getWeather("贵阳");
		String len[]=weather.split("#");
		for(int i=0;i<len.length-1;i++){
		System.out.println(len[i]);
		}
	}
}
