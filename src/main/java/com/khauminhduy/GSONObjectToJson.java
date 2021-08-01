package com.khauminhduy;

import java.util.HashSet;
import java.util.Set;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSONObjectToJson {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder()
//						.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
						.setPrettyPrinting()
						.create();
        Student student = createStudent();
        String jsonStr = gson.toJson(student);
        System.out.println(jsonStr);
        
        System.out.println();
        
        Gson gson2 = new Gson();
        String json = gson2.toJson(student);
        System.out.println(json);
	}

	private static Student createStudent() {
		Student student = new Student();
		student.setStudentId(1000);
		student.setStudentName("Ramesh");
		Set<Phone> phones = new HashSet<>();
		Phone phone = new Phone();
		phone.setPhoneId(100);
		phone.setPhoneNumber("1234567890");
		phone.setPhoneType("Mobile Phone");
		phones.add(phone);

		Phone phone1 = new Phone();
		phone1.setPhoneId(101);
		phone1.setPhoneNumber("2222 3333 44");
		phone1.setPhoneType("Landline Phone");
		phones.add(phone1);

		student.setStudentPhoneNumbers(phones);
		return student;
	}
}
