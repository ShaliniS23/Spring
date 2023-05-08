package com.skct.day1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skct.day1.Model.Loginmodel;
import com.skct.day1.Repository.Loginrepo;
@Service
public class Loginservice {
	
	
	
		@Autowired
		private Loginrepo repository;
		
		public String checkLogin(String uname, String pwd) {
		    Loginmodel user = repository.findByname(uname);
		    if (user == null) {
		      return "no user found";
		    }
		    else{
		    	if(user.getPwd().equals(pwd)) {	    		
		    		return"Login Succesfull"; 
		    	}
		    	else {
		    		return "Login Failed";
		    	}
		    }
		}
		public Loginmodel addUser(Loginmodel lgn) {
			return repository.save(lgn);
		}
		public List<Loginmodel> getUname(){
			return repository.findAll();
		}
	}



	