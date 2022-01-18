package com.khauminhduy.test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Test {

	public static void main(String[] args) {
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("Name", "Khau Minh Duy");
		jsonObject.addProperty("Age", 23);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(jsonObject);
		
		System.out.println(json);
	}
	
}
