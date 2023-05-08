package com.EducationalLoanPortal.app.Services;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;


	import com.EducationalLoanPortal.app.Models.LoanApplicationModel;
	import com.EducationalLoanPortal.app.Repositories.LoanApplicationModelRepo;

	@Service
	public class LoanApplicationService {
		
		@Autowired
		LoanApplicationModelRepo laRepo;
		
		
		public LoanApplicationModel saveDetails(LoanApplicationModel lam)
		{
			return laRepo.save(lam);
		}
		

		public  List<LoanApplicationModel> getAllLoans()
		{
			return laRepo.findAll();
		}
		
		public LoanApplicationModel updateLoan(LoanApplicationModel a, int loanId) 
		{
			return laRepo.save(a);
		}

		public void deleteLoan(int loanId) 
		{
			laRepo.deleteById(loanId);
		}

		public LoanApplicationModel getLoanById(int loanId) 
		{
				return laRepo.findById(loanId).get();
		}

		public LoanApplicationModel updateLoanById(LoanApplicationModel s, int loanId) 
		{
			Optional<LoanApplicationModel> optional=laRepo.findById(loanId);
			LoanApplicationModel obj=null;
			if(optional.isPresent())
			{
				obj=optional.get();
				obj.setLoanId(s.getLoanId());
				obj.setLoantype(s.getLoantype());
				obj.setApplicantName(s.getApplicantName());
				obj.setApplicantAddress(s.getApplicantAddress());
				obj.setApplicantMobile(s.getApplicantMobile());
				obj.setApplicantEmail(s.getApplicantEmail());
				obj.setApplicantAadhaar(s.getApplicantAadhaar());
				obj.setApplicantPan(s.getApplicantPan());
				obj.setApplicantSalary(s.getApplicantSalary());
				obj.setLoanAmountRequired(s.getLoanAmountRequired());
				obj.setLoanRepaymentMonths(s.getLoanRepaymentMonths());
				laRepo.saveAndFlush(s);
			}
			return obj;
		}
		 
		
		
		

	}


