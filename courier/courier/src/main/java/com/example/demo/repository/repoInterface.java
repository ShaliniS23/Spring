package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Courier;


//import jakarta.transaction.Transactional;

public interface repoInterface extends JpaRepository<Courier, Integer>{
//	@Query(value="select * from Courier ",nativeQuery=true)
//    public List<Courier> getAllData();
//    
//    @Query(value="select * from Courier where id=:id",nativeQuery=true)
//    public List<Courier> byCafenum (@Param("id")int id);
//    
//    @Query(value="select * from Courier where id between :start and :end",nativeQuery=true)
//    public List<Courier> startEnd(@Param("start") int start,@Param("end")int end);
//    
//    @Modifying
//    @Transactional
//    @Query(value="delete from Courier where id=?1 and SenderName=?2",nativeQuery = true)
//    Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
//    
//    @Modifying
//    @Transactional
//    @Query(value="update Courier set id=:pid where SenderName=:pname",nativeQuery=true)
//    public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
//    
//    @Query(value="select c from Courier c")
//    List<Courier> jpqlQ();
//    
//    @Query(value="select c from Courier c where c.id=?1")
//    public List<Courier> jqBYCon(@Param ("id")int sid);
}
	

