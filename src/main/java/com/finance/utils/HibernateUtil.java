package com.finance.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class HibernateUtil {
 
    private static SessionFactory sessionFactory;
 
    public static Session openSession() {
        return sessionFactory.openSession();
    }
    
	private void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
