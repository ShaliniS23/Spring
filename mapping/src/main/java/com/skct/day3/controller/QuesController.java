package com.skct.day3.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skct.day3.model.QuesModel;
import com.skct.day3.repository.OuesRepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/ques")
public class QuesController {
	@Autowired
	public OuesRepo qrep;
	@Tag(name="post",description="posting details")
	@PostMapping("")
	public String saveDetails(@RequestBody QuesModel ques)
	{
		qrep.save(ques);
		return "Data saved";
	}
	@Tag(name="get",description="Showing details")
	@GetMapping("")
	public List<QuesModel> getDetails()
	{
		 return qrep.findAll();
	}
	@Tag(name="put",description="Update details")
	@PutMapping("")
	public String updateDetails(@RequestBody QuesModel quest)
	{
		qrep.saveAndFlush(quest);
		return "Data changed";
	}
	@Tag(name="delete",description="Delete details")
	@DeleteMapping("/{qnum}")
	public String deleteDetails(@PathVariable int qnum)
	{
		qrep.deleteById(qnum);
		return "Qnum "+qnum+" deleted";
	}

}


