package com.training.web;

import java.util.List;

import javax.persistence.*;

public class CrudOperations {
	EntityManagerFactory userFactoryObj;
	EntityManager entity;
	
	CrudOperations(){
		userFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		entity = userFactoryObj.createEntityManager();
	}
	
	public void insertUser(String username, String password, String firstname, String lastname, boolean valid) {
		User s = new User(username, password, firstname, lastname, valid);
		entity.getTransaction().begin();
		entity.persist(s);
		entity.getTransaction().commit();
	}
	
	public void insertCourse(String name, int duration, int fee) {
		Course c = new Course(name, duration, fee);
		entity.getTransaction().begin();
		entity.persist(c);
		entity.getTransaction().commit();
	}
	
	public User findUser(String username, String password) {
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
		
		List<User> l =  entity.createQuery("select c from User c")
			    .getResultList();

		return l;
	}
	
	public List<Course> getCourses() {
		entity = userFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		List<Course> l = entity.createQuery("select c from Course c")
			    .getResultList();

		return l;
		
	}
}
