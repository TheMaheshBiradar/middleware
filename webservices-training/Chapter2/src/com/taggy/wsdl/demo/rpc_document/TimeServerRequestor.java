/**
 * 
 */
package com.taggy.wsdl.demo.rpc_document;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author Mahesh
 *
 */
public class TimeServerRequestor {
	private static final String SERVICE_URL = "http://127.0.0.1:8443/TimeMachineService";
	private static Logger logger=Logger.getLogger("TimeServerRequestor"); 

	public static void main(String[] args) throws MalformedURLException {

		
		URL url = new URL(SERVICE_URL+"?wsdl");
		QName qname = new QName("http://quickstart.taggy.com/", "TimeServerImplService");
		Service service = Service.create(url, qname);
		TimeServer timeServer = service.getPort(TimeServer.class);
		logger.info("Current Time is "+timeServer.getTimeAsString());
	}

}
