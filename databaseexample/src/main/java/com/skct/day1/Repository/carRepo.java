package com.skct.day1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skct.day1.example.example;

import jakarta.transaction.Transactional;
@Repository

public interface carRepo extends JpaRepository<example, Integer> {
	@Query(value="select * from cinema ",nativeQuery=true)
    public List<example> getAllData();
    
    @Query(value="select * from cinema where noofcast=:id",nativeQuery=true)
    public List<example> byCafenum (@Param("id")int id);
    
    @Query(value="select * from cinema where noofcast between :start and :end",nativeQuery=true)
    public List<example> startEnd(@Param("start") int start,@Param("end")int end);
    
    @Modifying
    @Transactional
    @Query(value="delete from cinema where noofcast=?1 and actor=?2",nativeQuery = true)
    Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
    
    @Modifying
    @Transactional
    @Query(value="update cinema set noofcast=:pid where actor=:pname",nativeQuery=true)
    public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
    
    @Query(value="select c from example c")
    List<example> jpqlQ();
    
    @Query(value="select c from example c where c.noofcast=?1")
    public List<example> jqBYCon(@Param ("id")int sid);
}
	
	