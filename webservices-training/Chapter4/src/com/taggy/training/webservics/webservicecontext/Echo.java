package com.taggy.training.webservics.webservicecontext;

import java.util.Map;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
@HandlerChain(file = "handler-chain.xml")
public class Echo {
	// Enable 'dependency injection' on web service context
	@Resource
	WebServiceContext ws_ctx;

	@SuppressWarnings("unchecked")
	@WebMethod
	public String echo(String from_client) {
		MessageContext ctx = ws_ctx.getMessageContext();
		Map<String , Object> req_headers = (Map<String, Object>) ctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		MapDump.dump_map((Map<String , Object> ) ctx, "");
		String response = "Echoing your message: " + from_client +"from host" +req_headers.get("Host");
		return response;
	}
}