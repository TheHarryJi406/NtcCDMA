package com.ailk.openbilling.service.imsintf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.designco.ntbilling.pojo.WsdlInfo;
import com.designco.ntbilling.util.Context;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-12-07T13:34:37.504+05:45
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "IInfoMgntService", 
                  wsdlLocation = "http://172.20.8.101:10106/InfoSystem/ws/imsintf_iInfoMgntService?wsdl",
//wsdlLocation = "http://192.168.200.101:10106/InfoSystem/ws/imsintf_iInfoMgntService?wsdl",
targetNamespace = "http://imsintf.service.openbilling.ailk.com/") 
public class IInfoMgntService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://imsintf.service.openbilling.ailk.com/", "IInfoMgntService");
    public final static QName IInfoMgntService = new QName("http://imsintf.service.openbilling.ailk.com/", "IInfoMgntService");
    static {
        URL url = null;
        try {
            //url = new URL("http://172.20.8.101:10106/InfoSystem/ws/imsintf_iInfoMgntService?wsdl");
            //url = new URL("http://192.168.200.101:10106/InfoSystem/ws/imsintf_iInfoMgntService?wsdl");
        	WsdlInfo wsdlInfo = (WsdlInfo) Context.get().getBean("wsdlInfo");
        	url = new URL(wsdlInfo.getHost());
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IInfoMgntService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.200.101:10106/InfoSystem/ws/imsintf_iInfoMgntService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IInfoMgntService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IInfoMgntService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IInfoMgntService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IInfoMgntService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IInfoMgntService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IInfoMgntService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IInfoMgntServiceWs
     */
    @WebEndpoint(name = "IInfoMgntService")
    public IInfoMgntServiceWs getIInfoMgntService() {
        return super.getPort(IInfoMgntService, IInfoMgntServiceWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IInfoMgntServiceWs
     */
    @WebEndpoint(name = "IInfoMgntService")
    public IInfoMgntServiceWs getIInfoMgntService(WebServiceFeature... features) {
        return super.getPort(IInfoMgntService, IInfoMgntServiceWs.class, features);
    }

}
