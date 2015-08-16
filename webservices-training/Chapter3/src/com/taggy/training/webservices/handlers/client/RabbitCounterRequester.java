package com.taggy.training.webservices.handlers.client;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import com.taggy.training.webservices.handlers.client.artifacts.FibException_Exception;
import com.taggy.training.webservices.handlers.client.artifacts.RabbitCounter;
import com.taggy.training.webservices.handlers.client.artifacts.RabbitCounterService;

public class RabbitCounterRequester {
	private static Logger logger=Logger.getLogger("RabbitCounterRequester"); 

	public static void main(String[] args) throws MalformedURLException, FibException_Exception {

		
		RabbitCounterService service = new RabbitCounterService();
		RabbitCounter rabbitCounterService = service.getRabbitCounterPort();
		logger.info("countRabbits " +
				" is "+rabbitCounterService.countRabbits(10));
	}
}
