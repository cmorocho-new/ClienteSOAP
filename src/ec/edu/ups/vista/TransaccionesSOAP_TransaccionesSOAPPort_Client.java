
package ec.edu.ups.vista;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import ec.edu.ups.common.Exception_Exception;
import ec.edu.ups.servicios.TransaccionesSOAP;
import ec.edu.ups.servicios.TransaccionesSOAPService;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-06-23T22:36:07.310-05:00
 * Generated source version: 2.7.11
 * 
 */
public final class TransaccionesSOAP_TransaccionesSOAPPort_Client {

    private static final QName SERVICE_NAME = new QName("http://servicios.ups.edu.ec/", "TransaccionesSOAPService");

    private TransaccionesSOAP_TransaccionesSOAPPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TransaccionesSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TransaccionesSOAPService ss = new TransaccionesSOAPService(wsdlURL, SERVICE_NAME);
        TransaccionesSOAP port = ss.getTransaccionesSOAPPort();  
        
        {
        System.out.println("Invoking transaccionDepostio...");
        java.lang.String _transaccionDepostio_arg0 = "";
        double _transaccionDepostio_arg1 = 0.0;
        try {
            java.lang.String _transaccionDepostio__return = port.transaccionDepostio(_transaccionDepostio_arg0, _transaccionDepostio_arg1);
            System.out.println("transaccionDepostio.result=" + _transaccionDepostio__return);
        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
        }
        
        {
        System.out.println("Invoking transaccionTransferencia...");
        java.lang.String _transaccionTransferencia_arg0 = "";
        java.lang.String _transaccionTransferencia_arg1 = "";
        double _transaccionTransferencia_arg2 = 0.0;
         try {
            java.lang.String _transaccionTransferencia__return = port.transaccionTransferencia(_transaccionTransferencia_arg0, _transaccionTransferencia_arg1, _transaccionTransferencia_arg2);
            System.out.println("transaccionTransferencia.result=" + _transaccionTransferencia__return);
        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
        }
        
        {
        System.out.println("Invoking transaccionRetiro...");
        java.lang.String _transaccionRetiro_arg0 = "";
        double _transaccionRetiro_arg1 = 0.0;
        try {
            java.lang.String _transaccionRetiro__return = port.transaccionRetiro(_transaccionRetiro_arg0, _transaccionRetiro_arg1);
            System.out.println("transaccionRetiro.result=" + _transaccionRetiro__return);
        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
        }

        System.exit(0);
    }

}
