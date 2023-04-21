package com.skct.day1.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueAnn 
{
	@Value("${carname:Audi}")
public String car;
	@GetMapping("ford")
	@ResponseBody

 
public String display()
{
	return "My fav Car "+car;
}
}
