package com.EducationalLoanPortal.app.Repositories;


	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.EducationalLoanPortal.app.Models.LoanApplicationModel;

	public interface LoanApplicationModelRepo extends JpaRepository<LoanApplicationModel, Integer>{
		Optional<LoanApplicationModel> findById(Integer loanid);

	}


