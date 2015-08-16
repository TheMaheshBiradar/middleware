Client Porgramatic Way of handling 


class FibClientHR {
public static void main(String[ ] args) {
RabbitCounterService service = new RabbitCounterService();
service.setHandlerResolver(new ClientHandlerResolver());
RabbitCounter port = service.getRabbitCounterPort();
try {
int n = 27;
System.out.printf("fib(%d) = %d\n", n, port.countRabbits(n));
}
catch(Exception e) { System.err.println(e); }
}
}
class ClientHandlerResolver implements HandlerResolver {
public List<Handler> getHandlerChain(PortInfo port_info) {
List<Handler> hchain = new ArrayList<Handler>();
hchain.add(new UUIDHandler());
hchain.add(new TestHandler()); // for illustration only
}
}


====================================================SOAP Request==============

<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Header>
      <uuid SOAP-ENV:actor="http://schemas.xmlsoap.org/soap/actor/next" xmlns="http://quickstart.taggy.com" xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">a796773c-d616-4209-9079-9f6a18877dd4</uuid>
   </S:Header>
   <S:Body>
      <ns2:countRabbits xmlns:ns2="http://quickstart.taggy.com">
         <arg0>10</arg0>
      </ns2:countRabbits>
   </S:Body>
</S:Envelope>