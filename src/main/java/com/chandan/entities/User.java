package com.chandan.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	@NotNull(message = "user name should not be null.")
	@NotEmpty(message = "user name should not be empty.")
	@NotBlank(message = "user name should not be blank.")
	@Column(name = "user_name")
	private String name;

	@NotNull(message = "user city should not be null.")
	@NotEmpty(message = "user city should not be empty.")
	@NotBlank(message = "user city should not be blank.")
	@Column(name = "user_city")
	private String city;

	@NotNull(message = "user mobile should not be null.")
	@NotEmpty(message = "user mobile should not be empty.")
	@NotBlank(message = "user mobile should not be blank.")
	@Column(name = "user_mobile")
	private String mob;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id,
			@NotNull(message = "user name should not be null.") @NotEmpty(message = "user name should not be empty.") @NotBlank(message = "user name should not be blank.") String name,
			@NotNull(message = "user city should not be null.") @NotEmpty(message = "user city should not be empty.") @NotBlank(message = "user city should not be blank.") String city,
			@NotNull(message = "user mobile should not be null.") @NotEmpty(message = "user mobile should not be empty.") @NotBlank(message = "user mobile should not be blank.") String mob) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mob = mob;
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", mob=" + mob + "]";
	}

}
