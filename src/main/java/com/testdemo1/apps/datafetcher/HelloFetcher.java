package com.testdemo1.apps.datafetcher;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloFetcher {
	
	@QueryMapping
	public String hello(){
		return "hello";
	}

}
