This tutorial explains the use of wsimport utility.

We will create Java artifact using this utility for both RPC and DOCUEMENT style webservice .

wsimport takes argument such as package -p .

We can create client easily using wsimport as this creates Interface and Impl class for a webservice to call with all the details like Qname , Namespaces etc..


1. RPC- Remote Procedure call.

wsimport -keep -p com.taggy.wsdl.demo.wsimport http://127.0.0.1:8443/TimeMachineService?wsdl

Execute this command on src folder

This should generate the classes in com.taggy.wsdl.demo.wsimport package.



2.Document Style webservice .

To enable document style web service , First we to configure this as we have given bindings as "@SOAPBinding(style=Style.RPC)" in TimeServer.



So , default binding is document ,we will remove the binding part out of the code .Code will so something like.

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

Now ,execute below command in cmd/terminal tool.

wsimport -keep -p com.taggy.wsdl.demo.rpc_document http://127.0.0.1:8443/TimeMachineService?wsdl

This should generate Java artifacts in com.taggy.wsdl.demo.rpc_document package.



=====================================================

