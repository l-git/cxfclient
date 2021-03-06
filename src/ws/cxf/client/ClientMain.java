package ws.cxf.client;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import ws.cxf.HelloService;
import ws.cxf.User;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        
        // Use the URL defined in the soap address portion of the WSDL
        factory.setAddress("http://localhost:8080/cxfserver/HelloWebService");
        
        // Utilize the class which was auto-generated by Apache CXF wsdl2java
        factory.setServiceClass(HelloService.class);
        
        Object client = factory.create();
       
        // Adding Logging Interceptors
        LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();
        loggingOutInterceptor.setPrettyLogging(true);
        ClientProxy.getClient(client).getOutInterceptors().add(loggingOutInterceptor);
        
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();
        loggingInInterceptor.setPrettyLogging(true);
        ClientProxy.getClient(client).getInInterceptors().add(loggingInInterceptor);
        
        
        HelloService h=(HelloService) client;
        
        
       while(true){
        
        User u=h.getUser(1L);
        System.out.println(u);
        
       String s= h.f("s1","s2");
       System.out.println(s);
       
        
        
       }
		
	}

}
