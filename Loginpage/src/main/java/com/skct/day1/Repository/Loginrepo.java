package com.skct.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skct.day1.Model.Loginmodel;

public interface Loginrepo extends JpaRepository<Loginmodel, Integer> {

	Loginmodel findByname(String uname);

}
