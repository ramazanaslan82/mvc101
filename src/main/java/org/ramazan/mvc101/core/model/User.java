package org.ramazan.mvc101.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name="users")
public class User {

	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
