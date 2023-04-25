package com.skct.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skct.day1.example.example;
@Repository

public interface carRepo extends JpaRepository<example, Integer> {

}
