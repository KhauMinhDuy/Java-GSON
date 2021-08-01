package com.khauminhduy;

import com.google.gson.Gson;

public class GSONPrimitiveExamples {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		System.out.println(gson.toJson(1));
		
		System.out.println(gson.toJson("abcd"));
		
		System.out.println(gson.toJson(new Long(10)));
		
		int[] value = {1};
		System.out.println(gson.toJson(value));
		
		System.out.println(gson.toJson(new Double(10.0d)));
		
		System.out.println(gson.toJson(new Character('A')));
		
		System.out.println(gson.fromJson("1", int.class));
		
		System.out.println(gson.fromJson("1", Integer.class));
		
		System.out.println(gson.fromJson("1", Long.class));
		
		System.out.println(gson.fromJson("false", Boolean.class));
		
		System.out.println(gson.fromJson("\"abcd\"", String.class));
		
		System.out.println(gson.fromJson("[\"abc\", \"xyz\"]", String[].class));
		
		System.out.println(gson.fromJson("A", Character.class));
		
	}

}
