package com.khauminhduy;

import com.google.gson.Gson;

public class GSONJsonToObject {

	public static void main(String[] args) {
		 Gson gson = new Gson();
	        String jsonStr = "{\r\n" +
	            "  \"studentId\": 1000,\r\n" +
	            "  \"studentName\": \"Ramesh\",\r\n" +
	            "  \"studentPhoneNumbers\": [\r\n" +
	            "    {\r\n" +
	            "      \"phoneId\": 100,\r\n" +
	            "      \"phoneType\": \"Mobile Phone\",\r\n" +
	            "      \"phoneNumber\": \"1234567890\"\r\n" +
	            "    },\r\n" +
	            "    {\r\n" +
	            "      \"phoneId\": 101,\r\n" +
	            "      \"phoneType\": \"Landline Phone\",\r\n" +
	            "      \"phoneNumber\": \"2222 3333 44\"\r\n" +
	            "    }\r\n" +
	            "  ]\r\n" +
	            "}";
	        Student student = gson.fromJson(jsonStr, Student.class);
	        System.out.println(student.toString());
	}

}
