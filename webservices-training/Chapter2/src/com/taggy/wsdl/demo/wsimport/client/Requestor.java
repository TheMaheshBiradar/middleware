/**
 * 
 */
package com.taggy.wsdl.demo.wsimport.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.taggy.wsdl.demo.wsimport.TimeServer;
import com.taggy.wsdl.demo.wsimport.TimeServerImplService;

/**
 * @author Mahesh
 *
 */
public class Requestor {
	//private static final String SERVICE_URL = "http://127.0.0.1:8443/TimeMachineService";
	private static Logger logger=Logger.getLogger("TimeServerRequestor"); 

	public static void main(String[] args) throws MalformedURLException {

		
	//	URL url = new URL(SERVICE_URL+"?wsdl");
	//	QName qname = new QName("http://quickstart.taggy.com/", "TimeServerImplService");
		//Service service = Service.create(url, qname);
		//TimeServer timeServer = service.getPort(TimeServer.class);
	//	logger.info("Current Time is "+timeServer.getTimeAsString());
		
		// The TimeServerImplService class is the Java type bound to
		// the service section of the WSDL document.
		TimeServerImplService service = new TimeServerImplService();
		// The TimeServer interface is the Java type bound to
		// the portType section of the WSDL document.
		TimeServer eif = service.getTimeServerImplPort();
		// Invoke the methods.
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
		
		logger.info("Current Time is "+eif.getTimeAsString());
		
	}

}
