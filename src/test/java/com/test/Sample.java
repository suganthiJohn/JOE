package com.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\jasfer john\\eclipse-workspace\\APIJSONREAD\\src\\test\\resources\\Employee.json");
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(file,Employee.class);
		String name = employee.getName();
		System.out.println(name);
		long phoneno = employee.getPhoneno();
		System.out.println(phoneno);
		
		
		
		
		
		
	}

}
