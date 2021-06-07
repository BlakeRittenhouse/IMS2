package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Order> readALL() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orderDAO.readAll()) {
			LOGGER.info(order);
		}
		return orderDAO.readAll();
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Order create() {
		LOGGER.info("Please enter the CustomerId");
		String CustomerId = utils.getString();
		LOGGER.info("Please enter the ItemId");
		String ItemId = utils.getString();
		Order order = orderDAO.create(new Order(null, CustomerId, ItemId));
		LOGGER.info("Order created");
		return order;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the Order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the CustomerId");
		String CustomerId = utils.getString();
		LOGGER.info("Please enter the ItemId");
		String ItemId = utils.getString();
		Order order = orderDAO.update(new Order(id, CustomerId, ItemId));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the Order you would like to delete");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}

}
