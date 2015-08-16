/**
 * 
 */
package com.taggy.wsdl.demo.rpc_document;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Mahesh
 *
 */
@WebService
//@SOAPBinding(style=Style.RPC)
public interface TimeServer {
	
	@WebMethod String getTimeAsString();
	@WebMethod long getTimeAsElapsed();
	

}
