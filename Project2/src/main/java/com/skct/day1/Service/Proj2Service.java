package com.skct.day1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.skct.day1.Models.AdminModel;
import com.skct.day1.Models.LoanApplicationModel;
import com.skct.day1.Models.LoginModel;
import com.skct.day1.Models.UserModel;
import com.skct.day1.Repository.AdminRepo;
import com.skct.day1.Repository.LoanAppRepo;
import com.skct.day1.Repository.Loginrepo;
import com.skct.day1.Repository.UserModelRepo;

public class Proj2Service {
	
		@Autowired
		public AdminRepo arepo;
		@Autowired
		public LoanAppRepo lrepo;
		@Autowired
		public Loginrepo lgrepo;
		@Autowired
		public UserModelRepo usrepo;
		
		//UserModel
		//post
		public UserModel saveInfo(@RequestBody UserModel  obj)
		{
			return usrepo.save(obj);
		}
		//get
		public List<UserModel> getInfo()
		{
			return usrepo.findAll();
		}
		//put
		public UserModel UpdateInfo(UserModel obj1)
		{
			return usrepo.saveAndFlush(obj1);
		}
		//delete
		public void deleteInfo(int id)
		{
			usrepo.deleteById(id);
		}
		
		//LoginModel
		//post
		public LoginModel saveInfo1(@RequestBody LoginModel  obj2)
		{
			return lrepo.save(obj2);
		}
		//get
		public List<LoginModel> getInfo1()
		{
			return lrepo.findAll();
		}
		//put
		public LoginModel UpdateInfo1(LoginModel obj3)
		{
			return lrepo.saveAndFlush(obj3);
		}
		//delete
		public void deleteInfo1(String Email)
		{
			lrepo.deleteById(Email);
		}
		
		//LoanApplicationModel
		//post
		public LoanApplicationModel saveInfo2(@RequestBody LoanApplicationModel  obj4)
		{
			return lgrepo.save(obj4);
		}
		//get
		public List<LoanApplicationModel> getInfo2()
		{
			return lgrepo.findAll();
		}
		//put
		public LoanApplicationModel UpdateInfo2(LoanApplicationModel obj5)
		{
			return lgrepo.saveAndFlush(obj5);
		}
		//delete
		public void deleteInfo2(int id)
		{
			lgrepo.deleteById(id);
		}
		//AdminModel
		//post
		public AdminModel saveInfo3(@RequestBody AdminModel  obj6)
		{
			return arepo.save(obj6);
		}
		//get
		public List<AdminModel> getInfo3()
		{
			return arepo.findAll();
		}
		//put
		public AdminModel UpdateInfo3(AdminModel obj7)
		{
			return arepo.saveAndFlush(obj7);
		}
		//delete
		public void deleteInfo3(String Password)
		{
			arepo.deleteById(Password);
		}
	}


