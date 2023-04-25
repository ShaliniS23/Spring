package com.skct.day1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skct.day1.Repository.carRepo;
import com.skct.day1.example.example;
@Service
public class carServ {
	@Autowired

	public carRepo crepo;
	public example addDetails(example obj) {
		return crepo.save(obj);
	}
	public List<example> getInfo(){
		return crepo.findAll();
	}
	
	public example UpdateInfo(example ex) {
		return crepo.saveAndFlush(ex);
	}
	public void deleteInfo(int noofcast) {
		crepo.deleteById(noofcast);
	}
	
	
}
