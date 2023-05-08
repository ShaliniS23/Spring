package com.EducationalLoanPortal.app.Repositories;


	import org.springframework.data.jpa.repository.JpaRepository;

	import com.EducationalLoanPortal.app.Models.UserModel;

	public interface UserModelRepo extends JpaRepository<UserModel, Integer> {
	UserModel findByEmail(String email);
	}


