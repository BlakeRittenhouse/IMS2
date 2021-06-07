package com.qa.ims.persistence.domain;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class Item {

	private Long id;
	private String name;
	private String price;

	public Item(Long id, String name, String price) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
	}

	public Item(String name, String price) {
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Item other = (Item) obj;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(id).append(name).append(price).toHashCode();

	}

	@Override
	public String toString() {
		return "item [id=" + id + ", Name=" + name + ", price=" + price + "]";
	}

}
