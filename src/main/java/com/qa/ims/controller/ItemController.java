package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO ItemDAO, Utils utils) {
		super();
		this.itemDAO = ItemDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Item> readALL() {
		List<Item> items = itemDAO.readAll();
		for (Item item : itemDAO.readAll()) {
			LOGGER.info(item);
		}
		return itemDAO.readAll();
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Item create() {
		LOGGER.info("Please enter a name");
		String Name = utils.getString();
		LOGGER.info("Please enter a Price");
		String Price = utils.getString();
		Item item = itemDAO.create(new Item(null, Name, Price));
		LOGGER.info("Item created");
		return item;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the Item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a Name");
		String Name = utils.getString();
		LOGGER.info("Please enter a Price");
		String Price = utils.getString();
		Item item = itemDAO.update(new Item(id, Name, Price));
		LOGGER.info("Item Updated");
		return item;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the Item you would like to delete");
		Long id = utils.getLong();
		return itemDAO.delete(id);
	}

}
