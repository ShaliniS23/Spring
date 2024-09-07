package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Validate;
import com.example.demo.repository.validateInterface;

@Service
public class validateService {
	@Autowired
	validateInterface vf;
	public Validate signup1(Validate v)
	{
		return vf.save(v);
	}
}
