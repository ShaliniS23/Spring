package com.EducationalLoanPortal.app.Services;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.EducationalLoanPortal.app.Models.LoanApplicationModel;
	import com.EducationalLoanPortal.app.Models.UserModel;
	import com.EducationalLoanPortal.app.Repositories.LoanApplicationModelRepo;
	import com.EducationalLoanPortal.app.Repositories.UserModelRepo;

	@Service
	public class UserModelService {
		@Autowired
		UserModelRepo usRepo;
		
		@Autowired
		LoanApplicationModelRepo lamRepo;
		
		public String validateUser(String email,String password)
		{
			String result="";
			UserModel u=usRepo.findByEmail(email);
			if(u==null)
			{
				result="Invalid User";
			}
			else
			{
				if(u.getPassword().equals(password))
				result="Login Succes";
			}
			return result;
		}
		public UserModel savedetails(UserModel um)
		{
			return usRepo.save(um);
		}
		
		
		public List<LoanApplicationModel> getAllLoans()
		{
			List<LoanApplicationModel> LoanApplicationList=lamRepo.findAll();
			return LoanApplicationList;
		}
		public LoanApplicationModel getLoan(int loanid)
		{
			LoanApplicationModel loan=lamRepo.findById(loanid).get();
			return loan;
		}
		public UserModel getProfile(int id)
		{
			UserModel user= usRepo.findById(id).get();
			return user;
		}
		public void deleteUser(int id)
		{
			usRepo.deleteById(id);
		}
		}


