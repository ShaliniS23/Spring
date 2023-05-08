package com.skct.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skct.day3.model.QuesModel;

public interface OuesRepo extends JpaRepository<QuesModel, Integer> {

}
