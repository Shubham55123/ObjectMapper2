package com.micro.soft;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample1 {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		Employee emp = new Employee();
		emp.setEmpId(1010);
		emp.setName("Shubham");
		emp.setEmail("shub@gmail.com");
		emp.setAddress("Punjab");
		
		try {
			String empString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			System.out.println(empString);
			
		   Employee readValue = mapper.readValue(empString, Employee.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
