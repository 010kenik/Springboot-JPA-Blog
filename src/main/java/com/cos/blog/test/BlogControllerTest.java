package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	// 요청rul :            http://localhost/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		// [문제점] spring-boot 2.7.8   + tomcat 충돌 해결
		/*
		<dependency>
		    <groupId>org.apache.tomcat.embed</groupId>
		    <artifactId>tomcat-embed-jasper</artifactId> 
		</dependency>
		*/
		// server.port=80  변경
		return "<h1>hello spring boot</h1>";
	}

}
