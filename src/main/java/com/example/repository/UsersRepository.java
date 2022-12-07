package com.example.repository;

import com.example.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Students,Long> {


    @Query(value = "select u FROM Students u WHERE u.email LIKE :email and u.password LIKE :password")
    List<Students> checkLogin(@Param("email") String email, @Param("password") String password);


}
