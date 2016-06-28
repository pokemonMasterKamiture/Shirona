package com.mycompany.myapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "testtb")
public class FormModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;



	@Column(name = "name", nullable = false, length = 100)
	private String name;



	@Override
	public String toString() {
		return "FormModel [id=" + id + ", name=" + name + "]";
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