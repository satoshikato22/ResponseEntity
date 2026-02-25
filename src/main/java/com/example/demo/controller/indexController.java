package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class indexController {

	@GetMapping("/")
	public String getIndex() {
		
		return "index.html";
	}
	
	@PostMapping("/api/user")
	public ResponseEntity<Map<String, Object>> receiveJson(@RequestBody Map<String, Object> json) {
	    System.out.println(json.get("name"));
	    System.out.println(json.get("age"));
	    json.put("birthYear", 1990);
	    json.put("obj", new Object());
	    return ResponseEntity.ok(json);
	}

}
