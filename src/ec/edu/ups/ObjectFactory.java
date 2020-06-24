
package ec.edu.ups;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransaccionDepostio_QNAME = new QName("http://servicios.ups.edu.ec/", "transaccionDepostio");
    private final static QName _TransaccionTransferencia_QNAME = new QName("http://servicios.ups.edu.ec/", "transaccionTransferencia");
    private final static QName _TransaccionRetiro_QNAME = new QName("http://servicios.ups.edu.ec/", "transaccionRetiro");
    private final static QName _TransaccionRetiroResponse_QNAME = new QName("http://servicios.ups.edu.ec/", "transaccionRetiroResponse");
    private final static QName _Exception_QNAME = new QName("http://servicios.ups.edu.ec/", "Exception");
    private final static QName _TransaccionDepostioResponse_QNAME = new QName("http://servicios.ups.edu.ec/", "transaccionDepostioResponse");
    private final static QName _TransaccionTransferenciaResponse_QNAME = new QName("http://servicios.ups.edu.ec/", "transaccionTransferenciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransaccionTransferencia }
     * 
     */
    public TransaccionTransferencia createTransaccionTransferencia() {
        return new TransaccionTransferencia();
    }

    /**
     * Create an instance of {@link TransaccionRetiro }
     * 
     */
    public TransaccionRetiro createTransaccionRetiro() {
        return new TransaccionRetiro();
    }

    /**
     * Create an instance of {@link TransaccionDepostio }
     * 
     */
    public TransaccionDepostio createTransaccionDepostio() {
        return new TransaccionDepostio();
    }

    /**
     * Create an instance of {@link TransaccionDepostioResponse }
     * 
     */
    public TransaccionDepostioResponse createTransaccionDepostioResponse() {
        return new TransaccionDepostioResponse();
    }

    /**
     * Create an instance of {@link TransaccionTransferenciaResponse }
     * 
     */
    public TransaccionTransferenciaResponse createTransaccionTransferenciaResponse() {
        return new TransaccionTransferenciaResponse();
    }

    /**
     * Create an instance of {@link TransaccionRetiroResponse }
     * 
     */
    public TransaccionRetiroResponse createTransaccionRetiroResponse() {
        return new TransaccionRetiroResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionDepostio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "transaccionDepostio")
    public JAXBElement<TransaccionDepostio> createTransaccionDepostio(TransaccionDepostio value) {
        return new JAXBElement<TransaccionDepostio>(_TransaccionDepostio_QNAME, TransaccionDepostio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionTransferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "transaccionTransferencia")
    public JAXBElement<TransaccionTransferencia> createTransaccionTransferencia(TransaccionTransferencia value) {
        return new JAXBElement<TransaccionTransferencia>(_TransaccionTransferencia_QNAME, TransaccionTransferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionRetiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "transaccionRetiro")
    public JAXBElement<TransaccionRetiro> createTransaccionRetiro(TransaccionRetiro value) {
        return new JAXBElement<TransaccionRetiro>(_TransaccionRetiro_QNAME, TransaccionRetiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionRetiroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "transaccionRetiroResponse")
    public JAXBElement<TransaccionRetiroResponse> createTransaccionRetiroResponse(TransaccionRetiroResponse value) {
        return new JAXBElement<TransaccionRetiroResponse>(_TransaccionRetiroResponse_QNAME, TransaccionRetiroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionDepostioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "transaccionDepostioResponse")
    public JAXBElement<TransaccionDepostioResponse> createTransaccionDepostioResponse(TransaccionDepostioResponse value) {
        return new JAXBElement<TransaccionDepostioResponse>(_TransaccionDepostioResponse_QNAME, TransaccionDepostioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionTransferenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ups.edu.ec/", name = "transaccionTransferenciaResponse")
    public JAXBElement<TransaccionTransferenciaResponse> createTransaccionTransferenciaResponse(TransaccionTransferenciaResponse value) {
        return new JAXBElement<TransaccionTransferenciaResponse>(_TransaccionTransferenciaResponse_QNAME, TransaccionTransferenciaResponse.class, null, value);
    }

}
