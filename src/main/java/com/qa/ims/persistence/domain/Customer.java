package com.qa.ims.persistence.domain;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class Customer {

	private Long id;
	private String firstName;
	private String surname;
	public Customer(Long id, String firstName, String surname) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setSurname(surname);
	}

	public Customer(String firstName, String surname) {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Customer other = (Customer) obj;
		if (getFirstName() == null) {
			if (other.getFirstName() != null)
				return false;
		} else if (!getFirstName().equals(other.getFirstName()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (surname == null) {
			if (other.surname != null) 
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(id).append(firstName).append(surname).toHashCode();

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", surname=" + surname + "]";
	}

}
