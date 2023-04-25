package com.jsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.dto.User;

@Repository
public interface MyRep extends JpaRepository<User, Integer>{

}
