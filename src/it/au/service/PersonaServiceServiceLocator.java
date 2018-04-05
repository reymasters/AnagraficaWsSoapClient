/**
 * PersonaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.au.service;

public class PersonaServiceServiceLocator extends org.apache.axis.client.Service implements it.au.service.PersonaServiceService {

    public PersonaServiceServiceLocator() {
    }


    public PersonaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonaService
    private java.lang.String PersonaService_address = "http://localhost:8080/AnagraficaWsSoap/services/PersonaService";

    public java.lang.String getPersonaServiceAddress() {
        return PersonaService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonaServiceWSDDServiceName = "PersonaService";

    public java.lang.String getPersonaServiceWSDDServiceName() {
        return PersonaServiceWSDDServiceName;
    }

    public void setPersonaServiceWSDDServiceName(java.lang.String name) {
        PersonaServiceWSDDServiceName = name;
    }

    public it.au.service.PersonaService getPersonaService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonaService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonaService(endpoint);
    }

    public it.au.service.PersonaService getPersonaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.au.service.PersonaServiceSoapBindingStub _stub = new it.au.service.PersonaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonaServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonaServiceEndpointAddress(java.lang.String address) {
        PersonaService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.au.service.PersonaService.class.isAssignableFrom(serviceEndpointInterface)) {
                it.au.service.PersonaServiceSoapBindingStub _stub = new it.au.service.PersonaServiceSoapBindingStub(new java.net.URL(PersonaService_address), this);
                _stub.setPortName(getPersonaServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PersonaService".equals(inputPortName)) {
            return getPersonaService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.au.it", "PersonaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.au.it", "PersonaService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonaService".equals(portName)) {
            setPersonaServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
