
package ws.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISurveyService", targetNamespace = "http://cxf.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISurveyService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "vote", targetNamespace = "http://cxf.ws/", className = "ws.cxf.Vote")
    @ResponseWrapper(localName = "voteResponse", targetNamespace = "http://cxf.ws/", className = "ws.cxf.VoteResponse")
    public String vote(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
