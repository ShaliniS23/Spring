package com.skct.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skct.day1.Models.UserModel;

public interface UserModelRepo extends JpaRepository<UserModel, Integer> {

}
