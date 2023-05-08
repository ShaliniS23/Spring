package com.skct.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skct.day3.model.AnsModel;

public interface AnsRepo extends JpaRepository<AnsModel, Integer> {

}
