package com.cust.pi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cust.pi.service.CustomerPiService;
import com.cust.pi.vo.CustomerVo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class CustomerPiController {

	@Autowired CustomerPiService custPiService;
	
	@Autowired
	private Environment env;
	
	@PostMapping("/customer")
	public String createCustomerPi(@RequestBody CustomerVo input) throws JsonParseException, JsonMappingException, IOException {
		/*
		 * ObjectMapper mapper = new ObjectMapper();
		 * mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		 * CustomerVo customer = mapper.readValue(input, CustomerVo.class);
		 */	
		input.setPort(env.getProperty("{server.port}"));
		String cust = custPiService.createCustomer(input);
		return cust;
	}
	
}
