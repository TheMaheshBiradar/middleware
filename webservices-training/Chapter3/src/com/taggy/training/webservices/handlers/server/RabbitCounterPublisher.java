/**
 * 
 */
package com.taggy.training.webservices.handlers.server;

import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

/**
 * @author Mahesh
 *
 */
public class RabbitCounterPublisher {

	private static final String SERVICE_URL = "http://127.0.0.1:8443/RabbitCounterService";
	private static final String MULTI_PORT = "http://127.0.0.1:8444/RabbitCounterService";
	private static Logger logger=Logger.getLogger("TimeServerPublisher"); 

	public static void main(String[] args) {
		logger.info("Starting the Server....");
		Endpoint.publish(SERVICE_URL, new RabbitCounter());
		Endpoint.publish(MULTI_PORT, new RabbitCounter());
		
		logger.info("Serve is ready .....");
	}
}
