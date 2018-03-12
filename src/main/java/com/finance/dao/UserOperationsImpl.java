package com.finance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.finance.model.Person;
import com.finance.model.User;

public class UserOperationsImpl implements UserOperationsDAO{

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	@Override
	public boolean userValidation(User user) {
		
		return false;
	}

}
