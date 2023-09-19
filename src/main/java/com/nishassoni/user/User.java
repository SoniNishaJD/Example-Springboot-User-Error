package com.nishassoni.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	
	private Integer id;
	@Size(min = 2, message="Name should have atleast 2 character")
	private String name;
	@Past(message = "Birth Date should be Past")
	private LocalDate birthDate;
	
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	
	
	public User(Integer id) {
		super();
		this.id = id;
	}

	public User() {
		super();
	}

	public User(String name, LocalDate birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
}
