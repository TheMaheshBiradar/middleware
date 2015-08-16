/**
 * 
 */
package com.taggy.quickstart;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author Mahesh
 *
 */
@WebService
@SOAPBinding(style=Style.RPC)
public interface TimeServer {
	
	@WebMethod String getTimeAsString();
	@WebMethod long getTimeAsElapsed();
	

}
