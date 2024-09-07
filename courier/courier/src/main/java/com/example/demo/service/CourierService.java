package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Courier;
import com.example.demo.repository.repoInterface;

@Service
public class CourierService 
{
	@Autowired
	private repoInterface repo1;
	
	public Courier addParcel(Courier obj) {
		return repo1.save(obj);
	}
	public List<Courier> getDetails()
	{
		List<Courier> arr= new ArrayList<>();
		arr=repo1.findAll();
		return arr;
	}
	public void cancelParcel(int id)
	{
		repo1.deleteById(id);
	}
	public Courier updateDetails(int id, Courier obj) {
		return repo1.saveAndFlush(obj);
	}
//	//sorting
//		public List<Courier>sortAsec(String Moviename)
//		{
//			return repo1.findAll(Sort.by(Moviename).ascending());
//		}
//		public List<Courier> pagination(int pageno, int pagesize) {
//			// TODO Auto-generated method stub
//			Page<Courier>p=repo1.findAll(PageRequest.of(pageno, pagesize));
//			return p.getContent();
//		}
//	
}