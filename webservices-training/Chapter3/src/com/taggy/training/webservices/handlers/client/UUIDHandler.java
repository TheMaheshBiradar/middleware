package com.taggy.training.webservices.handlers.client;

import java.util.UUID;
import java.util.Set;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPConstants;
import java.io.IOException;

public class UUIDHandler implements SOAPHandler<SOAPMessageContext> {
	private static final String LoggerName = "ClientSideLogger";
	private Logger logger;
	private final boolean log_p = true;

	public UUIDHandler() {
		logger = Logger.getLogger(LoggerName);
	}

	public boolean handleMessage(SOAPMessageContext ctx) {
		if (log_p)
			logger.info("handleMessage");

		Boolean isRequestOutgoing = (Boolean) ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (isRequestOutgoing) {

			UUID uuid = UUID.randomUUID();
			try {
				SOAPMessage soapMessage = ctx.getMessage();
				SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnvelope.getHeader();
				//soapEnvelope.getBody().getNamespaceURI();

				if (soapHeader == null)
					soapHeader = soapEnvelope.addHeader();

				QName qname = new QName("http://quickstart.taggy.com", "uuid");
				SOAPHeaderElement helem = soapHeader.addHeaderElement(qname);
				helem.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT); 
				helem.addTextNode(uuid.toString());
				soapMessage.saveChanges();

				soapMessage.writeTo(System.out);
			} catch (SOAPException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		return true;
	}

	public boolean handleFault(SOAPMessageContext ctx) {
		if (log_p)
			logger.info("handleFault");
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
			logger.info("getHeaders");
		return null;
	}

	public void close(MessageContext messageContext) {
		if (log_p)
			logger.info("close");
	}
}