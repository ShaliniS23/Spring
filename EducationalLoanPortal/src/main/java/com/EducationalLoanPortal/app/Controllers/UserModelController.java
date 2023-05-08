package com.EducationalLoanPortal.app.Controllers;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.EducationalLoanPortal.app.Models.LoanApplicationModel;
	import com.EducationalLoanPortal.app.Models.LoginModel;
	import com.EducationalLoanPortal.app.Models.UserModel;
	import com.EducationalLoanPortal.app.Services.UserModelService;

	@RestController
	public class UserModelController {
		@Autowired
		UserModelService usServ;
		
		
		@PostMapping("/login")
		public String validateUser(@RequestBody LoginModel lom)
		{
			return usServ.validateUser(lom.getEmail(),lom.getPassword());
		}
		
		@PostMapping("/signup")
		public UserModel saveDetails(@RequestBody UserModel u)
		{
			return usServ.savedetails(u);
		}
		
		@GetMapping("/getloan/{loanid}")
		public LoanApplicationModel getLoan(@PathVariable int loanid)
		{
			return usServ.getLoan(loanid);
		}
		
		@GetMapping("/getprofile/{id}")
		public UserModel getProfile(@PathVariable int id)
		{
			return usServ.getProfile(id);
			}
		
		@DeleteMapping("/deleteUser/{id}")
		public void deleteUser(@PathVariable("id") int id)
		{
			usServ.deleteUser(id);
		}

	}


