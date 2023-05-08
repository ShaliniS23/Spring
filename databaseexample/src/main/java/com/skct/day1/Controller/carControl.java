package com.skct.day1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skct.day1.Repository.carRepo;
import com.skct.day1.Service.carServ;
import com.skct.day1.example.example;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class carControl {
	@Autowired
	public carServ cserv;
	@PostMapping("/save")
	public example addDetails(@RequestBody example obj) {
		return cserv.addDetails(obj);
	}
	@GetMapping("/saveInform")
	public List<example> getDetails(){
		return cserv.getInfo();
		}
	@PutMapping("/putdata")
	public example update(@RequestBody example obj) {
		return cserv.UpdateInfo(obj);
	}
	
	@DeleteMapping("/deleteid/{noofcast}")
	public String delete1(@PathVariable("noofcast") int noofcast) {
		cserv.deleteInfo(noofcast);
		return "id "+noofcast+" deleted";
	}
	@DeleteMapping("del")
	public String del1(@RequestParam("noofcast") int noofcast) {
	 cserv.deleteInfo(noofcast);
	 return "id "+noofcast+" deleted";
	}
	//sorting
	@GetMapping("/pageget/{mname}")
	public List<example>sortmovie(@PathVariable("mname")String mname)
	{
		return cserv.sortAsec(mname);
	}
	//pagination
	@GetMapping("/pagination/{pageno}/{pagesize}")
	public List<example>page(@PathVariable("pageno")int pageno,@PathVariable("pagesize")int pagesize){
	{
		return cserv.pagination(pageno,pagesize);
	}
	}
	@Autowired
	public carRepo ir;

	@Tag( name="Native query",description="Getting details")
	@GetMapping("/saveir")
	public List<example> getD()
	{
		return ir.getAllData();
	}

	@Tag( name="Native query",description="Getting details by id")
	@GetMapping("byName/{id}")
	public List<example> getName(@PathVariable ("id") int pid )
	{
		return ir.byCafenum(pid);
	}

	@Tag( name="Native query",description="Getting details by start end method")
	@GetMapping("startend/{start}/{end}")
	public List<example> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
	{
		return ir.startEnd(start, end);
	}

	@Tag( name="Native query",description="Deleting details by id and name")
	@DeleteMapping("/del/{id}/{name}")
	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
	{
		ir.deleteD(id, name);
		return "deleted";
	}

	@Tag( name="Native query",description="Posting details")
	@PutMapping("updatee/{pid}/{pname}")
	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
	{
		ir.updateByQuery(pid, pname);
	}

	@Tag( name="JPQL",description="Getting details by methods")
	@GetMapping("jp")
	public List<example> jplQuery()
	{
		return ir.jpqlQ();
	}

	@Tag( name="JPQL",description="Getting details by id")
	@GetMapping("/upp/{id}")
	public List<example> jpqUp(@PathVariable ("id") int id)
	{
		return ir.jqBYCon(id);
	}
}
	