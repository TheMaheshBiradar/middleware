/**
 * 
 */
package com.taggy.wsdl.demo.rpc_document;

import java.util.Date;

import javax.jws.WebService;

/**
 * @author Mahesh
 *
 */
@WebService(endpointInterface="com.taggy.wsdl.demo.rpc_document.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		 return new Date().getTime();
	}

}
