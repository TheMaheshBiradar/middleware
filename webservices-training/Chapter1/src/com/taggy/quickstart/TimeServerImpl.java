/**
 * 
 */
package com.taggy.quickstart;

import java.util.Date;

import javax.jws.WebService;

/**
 * @author Mahesh
 *
 */
@WebService(endpointInterface="com.taggy.quickstart.TimeServer")
public class TimeServerImpl implements TimeServer {

	public String getTimeAsString() {
		return new Date().toString();
	}

	public long getTimeAsElapsed() {
		 return new Date().getTime();
	}

}
