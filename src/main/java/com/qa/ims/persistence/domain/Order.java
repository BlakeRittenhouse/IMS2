package com.qa.ims.persistence.domain;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class Order {

	private Long id3;
	private String CustomerId;
	private String ItemId;

	public Order(Long id3, String CustomerId, String ItemId) {
		this.setId(id3);
		this.setCustomerId(CustomerId);
		this.setItemId(ItemId);
	}

	public void order(Long id3, String CustomerId, String ItemId) {
	}

	public Long getId() {
		return id3;
	}

	public void setId(Long id3) {
		this.id3 = id3;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String CustomerId) {
		this.CustomerId = CustomerId;
	}

	public String getItemId() {
		return ItemId;
	}

	public void setItemId(String ItemId) {
		this.ItemId = ItemId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Order other = (Order) obj;
		if (getCustomerId() == null) {
			if (other.getCustomerId() != null)
				return false;
		} else if (!getCustomerId().equals(other.getCustomerId()))
			return false;
		if (id3 == null) {
			if (other.id3 != null)
				return false;
		} else if (!id3.equals(other.id3))
			return false;
		if (ItemId == null) {
			if (other.ItemId != null)
				return false;
		} else if (!ItemId.equals(other.ItemId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(id3).append(CustomerId).append(ItemId).toHashCode();

	}

	@Override
	public String toString() {
		return "Order [id3=" + id3 + ", CustomerId=" + CustomerId + ", ItemId=" + ItemId + "]";
	}

}
