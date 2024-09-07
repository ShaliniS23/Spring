package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Courier;
//import com.example.demo.repository.repoInterface;
import com.example.demo.service.CourierService;



@RestController
public class Controller
{ @Autowired
	private CourierService cService;
	@CrossOrigin(origins = "*")
	@PostMapping("/book")
	public Courier bookParcel(@RequestBody Courier p)
	{
		return cService.addParcel(p);
	}
	
	@GetMapping("/showAll")
	public List<Courier> showDetails()
	{
		List<Courier> alist= new ArrayList<>();
		alist=cService.getDetails();
		return alist;
	}
	
	@DeleteMapping("/cancel/{id}")
	public void cancelParcel(@PathVariable int id) {
		cService.cancelParcel(id);
	}
	@PutMapping("/update/{id}")
	public Courier updateDetails(@PathVariable int id, @RequestBody Courier p) {
		return cService.updateDetails(id, p);
	}
//	//sorting
//		@GetMapping("/pageget/{SenderName}")
//		public List<Courier>sortmovie(@PathVariable("SenderName")String SenderName)
//		{
//			return cService.sortAsec(SenderName);
//		}
//	@GetMapping("/pageget/{SenderName}")
//	public List<Courier>sortdetails(@PathVariable("SenderName")String SenderName)
//	{
//		return cService.sortAsec(SenderName);
//	}
//	//pagination
//	@GetMapping("/pagination/{pageno}/{pagesize}")
//	public List<Courier>page(@PathVariable("pageno")int pageno,@PathVariable("pagesize")int pagesize){
//	{
//		return cService.pagination(pageno,pagesize);
//	}
//	}
//	@Autowired
//	public  repoInterface ir;
//
//	//@Tag( name="Native query",description="Getting details")
//	@GetMapping("/saveir")
//	public List<Courier> getD()
//	{
//		return ir.getAllData();
//	}
//		//@Tag( name="Native query",description="Getting details by id")
//	@GetMapping("byName/{id}")
//	public List<Courier> getName(@PathVariable ("id") int pid )
//	{
//		return ir.byCafenum(pid);
//	}
//
//	//@Tag( name="Native query",description="Getting details by start end method")
//	@GetMapping("startend/{start}/{end}")
//	public List<Courier> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
//	{
//		return ir.startEnd(start, end);
//	}
//
//	//@Tag( name="Native query",description="Deleting details by id and name")
//	@DeleteMapping("/del/{id}/{name}")
//	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
//	{
//		ir.deleteD(id, name);
//		return "deleted";
//	}
//
//	//@Tag( name="Native query",description="Posting details")
//	@PutMapping("updatee/{pid}/{pname}")
//	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
//	{
//		ir.updateByQuery(pid, pname);
//	}
//
//	//@Tag( name="JPQL",description="Getting details by methods")
//	@GetMapping("jp")
//	public List<Courier> jplQuery()
//	{
//		return ir.jpqlQ();
//	}
//
//	//@Tag( name="JPQL",description="Getting details by id")
//	@GetMapping("/upp/{id}")
//	public List<Courier> jpqUp(@PathVariable ("id") int id)
//	{
//		return ir.jqBYCon(id);
//	}
}
//
//  
