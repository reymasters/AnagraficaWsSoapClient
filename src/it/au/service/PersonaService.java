/**
 * PersonaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.au.service;

public interface PersonaService extends java.rmi.Remote {
    public void addPersonaCustom(java.lang.String nome, java.lang.String cognome, java.lang.String mail) throws java.rmi.RemoteException;
    public it.au.bean.Persona getPersona(int id) throws java.rmi.RemoteException;
    public void addPersona(it.au.bean.Persona p1) throws java.rmi.RemoteException;
}
