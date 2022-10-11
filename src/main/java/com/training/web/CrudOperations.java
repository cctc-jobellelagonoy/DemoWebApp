package com.training.web;

import java.util.List;

import javax.persistence.*;

public class CrudOperations {
	EntityManagerFactory userFactoryObj;
	EntityManager entity;
	
	CrudOperations(){
		userFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		entity = userFactoryObj.createEntityManager();
		entity.getTransaction().begin();
	}
	
	public void insertEntity(String username, String password, String firstname, String lastname, boolean valid) {
		User s = new User(username, password, firstname, lastname, valid);
		entity.persist(s);
		entity.getTransaction().commit();
	}
	
	public User findEntity(String username, String password) {
		entity = userFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		User user = (User) entity.createQuery("select c from User c where c.username = :un and c.password = :pw")
				.setParameter("un", username)
				.setParameter("pw", password)
			    .getResultList().get(0);
			    
		return user;
	}
	
	public List<User> getUsers() {
		entity = userFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		return entity.createQuery("select c from User c")
			    .getResultList();
	}
}
