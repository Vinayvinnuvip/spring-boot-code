package com.jsp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.dao.MyRep;
import com.jsp.dto.User;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	MyRep rep;

	public List<User> getAll() {
		return rep.findAll();
	}

	public User save(User u) {
		return rep.save(u);
	}

	public Optional<User> findById(int id) {
		return rep.findById(id);
	}

	public User update(User u,int id) {
		Optional<User> us = findById(u.getId());
User u1=us.get();
u1.setId(id);
u1.setName(u.getName());
		if (us.isPresent()) {
			rep.save(u1);
			return us.get();
		}
		return null;
	}

	public User delete(int id) {
		Optional<User> u = findById(id);
		if (u.isPresent()) {
			rep.delete(u.get());
			return u.get();

		}
		return null;
	}
}
