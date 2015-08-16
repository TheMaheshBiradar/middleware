/**
 * 
 */
package com.taggy.training.webservics.webservicecontext;

import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

/**
 * @author Mahesh
 *
 */
public class EchoServicePublisher {

	private static final String SERVICE_URL = "http://127.0.0.1:8443/EchoService";
	private static final String MULTI_PORT = "http://127.0.0.1:8444/EchoService";
	private static Logger logger=Logger.getLogger("TimeServerPublisher"); 

	public static void main(String[] args) {
		logger.info("Starting the Server....");
		Endpoint.publish(SERVICE_URL, new Echo());
		Endpoint.publish(MULTI_PORT, new Echo());
		
		logger.info("Serve is ready .....");
	}
}
