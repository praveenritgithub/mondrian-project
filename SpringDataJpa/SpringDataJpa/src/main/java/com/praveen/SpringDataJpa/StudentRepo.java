package com.praveen.SpringDataJpa;
import java.util.List;

import com.praveen.SpringDataJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
   // @Query("select s from Student s where s.name= ?1")
    List<Student> findByName(String name);

}
