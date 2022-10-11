package com.training.web;

import javax.persistence.*;

@Entity
@Table(name="USERS_DB_TEST")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
    private String password;
	
	@Column(name="firstname")
    private String firstName;
	
	@Column(name="lastname")
    private String lastName;
	
	@Column(name="valid")
    public boolean valid;
	
    User(){
    	
    }
    
    
	
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public User(String username, String password, String firstName, String lastName, boolean valid) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.valid = valid;
	}



	public String getFirstName() {
       return firstName;
	}

    public void setFirstName(String newFirstName) {
       firstName = newFirstName;
	}

	
    public String getLastName() {
       return lastName;
	}

    public void setLastName(String newLastName) {
       lastName = newLastName;
	}
			

    public String getPassword() {
       return password;
	}

    public void setPassword(String newPassword) {
       password = newPassword;
	}
	
			
    public String getUsername() {
       return username;
	}
				
    public boolean isValid() {
       return valid;
	}

    public void setValid(boolean newValid) {
       valid = newValid;
	}	
}
