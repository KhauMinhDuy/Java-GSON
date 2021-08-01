package com.khauminhduy;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GSONCollectionsExample {

	public static void main(String[] args) {
		System.out.println("========================= SERIALIZE =========================");
		serialize();
		System.out.println("========================= DESERIALIZE =========================");
		deserialize();
	}

	private static void deserialize() {
		Gson gson = new Gson();
		String employeeJson = "[\r\n" + 
				  "  {\r\n" + 
				  "    \"firstName\": \"firstName1\",\r\n" + 
				  "    \"lastName\": \"lastName1\"\r\n" + 
				  "  },\r\n" + 
				  "  {\r\n" + 
				  "    \"firstName\": \"firstName2\",\r\n" + 
				  "    \"lastName\": \"lastName2\"\r\n" + 
				  "  },\r\n" + 
				  "  {\r\n" + 
				  "    \"firstName\": \"firstName3\",\r\n" + 
				  "    \"lastName\": \"lastName3\"\r\n" + 
				  "  },\r\n" + 
				  "  {\r\n" + 
				  "    \"firstName\": \"firstName4\",\r\n" + 
				  "    \"lastName\": \"lastName4\"\r\n" + 
				  "  },\r\n" + 
				  "  {\r\n" + 
				  "    \"firstName\": \"firstName5\",\r\n" + 
				  "    \"lastName\": \"lastName5\"\r\n" + 
				  "  }\r\n" + 
				  "]";
				Type type = new TypeToken<Collection<Employee>>(){}.getType();
				Collection<Employee> collectionOfEmp = gson.fromJson(employeeJson, type);
				System.out.println(collectionOfEmp);
	}

	private static void serialize() {
		Gson gson = new GsonBuilder()
						.setPrettyPrinting()
						.create();
		Collection<Employee> employees = Arrays.asList(new Employee("firstName1", "lastName1"),
		  new Employee("firstName2", "lastName2"),
		  new Employee("firstName3", "lastName3"),
		  new Employee("firstName4", "lastName4"),
		  new Employee("firstName5", "lastName5"));

		String empJson = gson.toJson(employees); 
		System.out.println(empJson);
	}

}
