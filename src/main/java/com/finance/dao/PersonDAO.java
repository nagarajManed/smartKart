package com.finance.dao;

import java.util.List;

import com.finance.model.Person;


public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}