package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Validate;
import com.example.demo.service.validateService;

@RestController
public class validateController {
	@Autowired
	validateService vs;
	@PostMapping("/signup")
	public Validate signup1(@RequestBody Validate v)
	{
		return vs.signup1(v);
	}
}
