/**
 * PersonaServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.au.service;

public interface PersonaServiceService extends javax.xml.rpc.Service {
    public java.lang.String getPersonaServiceAddress();

    public it.au.service.PersonaService getPersonaService() throws javax.xml.rpc.ServiceException;

    public it.au.service.PersonaService getPersonaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
