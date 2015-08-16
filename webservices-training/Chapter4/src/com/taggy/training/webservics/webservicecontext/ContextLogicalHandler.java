package com.taggy.training.webservics.webservicecontext;

import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class ContextLogicalHandler implements LogicalHandler<LogicalMessageContext> {
	private static final String LoggerName = "ClientSideLogger";
	private Logger logger;
	private final boolean log_p = true;

	public ContextLogicalHandler() {
		logger = Logger.getLogger(LoggerName);
	}

	public boolean handleMessage(LogicalMessageContext ctx) {
		if (log_p)
			logger.info(" LogicalHandle handleMessage");

		return true;
	}

	public boolean handleFault(SOAPMessageContext ctx) {
		if (log_p)
			logger.info("LogicalHandle handleFault");
		try {
			ctx.getMessage().writeTo(System.out);
		} catch (SOAPException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		return true;
	}

	public Set<QName> getHeaders() {
		if (log_p)
			logger.info("LogicalHandle getHeaders");
		return null;
	}

	public void close(MessageContext messageContext) {
		if (log_p)
			logger.info("LogicalHandle close");
	}

	@Override
	public boolean handleFault(LogicalMessageContext context) {
		return false;
	}
}