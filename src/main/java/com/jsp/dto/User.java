package com.jsp.dto;

import org.springframework.stereotype.Component;

@jakarta.persistence.Entity
@Component
public class User {
@jakarta.persistence.Id
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
