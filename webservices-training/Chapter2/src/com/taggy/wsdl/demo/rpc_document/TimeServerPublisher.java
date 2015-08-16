/**
 * 
 */
package com.taggy.wsdl.demo.rpc_document;

import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

/**
 * @author Mahesh
 *
 */
public class TimeServerPublisher {

	private static final String SERVICE_URL = "http://127.0.0.1:8443/TimeMachineService";
	private static final String MULTI_PORT = "http://127.0.0.1:8444/TimeMachineService";
	private static Logger logger=Logger.getLogger("TimeServerPublisher"); 

	public static void main(String[] args) {
		logger.info("Starting the Server....");
		Endpoint.publish(SERVICE_URL, new TimeServerImpl());
		Endpoint.publish(MULTI_PORT, new TimeServerImpl());
		
		logger.info("Serve is ready .....");
	}
}
