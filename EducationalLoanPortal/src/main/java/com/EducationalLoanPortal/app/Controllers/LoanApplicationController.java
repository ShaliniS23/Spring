package com.EducationalLoanPortal.app.Controllers;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.EducationalLoanPortal.app.Models.LoanApplicationModel;
	import com.EducationalLoanPortal.app.Services.LoanApplicationService;

	@RestController
	public class LoanApplicationController {
		@Autowired
		LoanApplicationService las;
		
		@PostMapping("/saveAllLoans")
		public LoanApplicationModel  saveDetails(@RequestBody LoanApplicationModel lm)
		{
			return las.saveDetails(lm);
		}
		
		@GetMapping("/getAllLoans")
		public  List<LoanApplicationModel> getAllLoans()
		{
		List<LoanApplicationModel> LoanApplicationModelList=las.getAllLoans();
		return LoanApplicationModelList;
		}
		
		@PutMapping("/updateLoan/{loanId}")
		public LoanApplicationModel updateLoan(@RequestBody LoanApplicationModel a, @PathVariable int loanId)
		{
			return las.updateLoan(a,loanId);
			
		}
		
		@DeleteMapping("/deleteLoan/{loanId}")
		public void deleteLoan(@PathVariable("loanId") int loanId)
		{
			las.deleteLoan(loanId);
			
		}
		
		@GetMapping("/getLoanById/{loanId}")
		public LoanApplicationModel getLoanById(@PathVariable("loanId") int loanId)
		{
			return las.getLoanById(loanId);
			
		}
		
		@PutMapping("/updateLoanById/{loanId}")
		public LoanApplicationModel updateLoanById(@RequestBody LoanApplicationModel a, @PathVariable int loanId)
		{
			return las.updateLoanById(a,loanId);
			
		}
		
	}


