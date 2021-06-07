package com.qa.ims;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.utils.Utils;

public class Runner {

	public static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		
		
		IMS ims = new IMS();
		ims.imsSystem(); 
		logger.info("SO LONG!");

		Utils.close();
	}
}