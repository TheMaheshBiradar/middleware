RPC

wsimport -keep -p com.taggy.wsdl.demo.wsimport http://127.0.0.1:8443/TimeMachineService?wsdl

Execute this command on ser folder

Doc

wsimport -keep -p com.taggy.wsdl.demo.rpc_document http://127.0.0.1:8443/TimeMachineService?wsdl
=====================================================

WebResult
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
	@WebMethod
@WebResult(partName = "time_response")
String getTimeAsString();
@WebMethod
@WebResult(partName = "time_response")
long getTimeAsElapsed();

}
==========================================================