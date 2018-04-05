package it.au.service;

public class PersonaServiceProxy implements it.au.service.PersonaService {
  private String _endpoint = null;
  private it.au.service.PersonaService personaService = null;
  
  public PersonaServiceProxy() {
    _initPersonaServiceProxy();
  }
  
  public PersonaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonaServiceProxy();
  }
  
  private void _initPersonaServiceProxy() {
    try {
      personaService = (new it.au.service.PersonaServiceServiceLocator()).getPersonaService();
      if (personaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personaService != null)
      ((javax.xml.rpc.Stub)personaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.au.service.PersonaService getPersonaService() {
    if (personaService == null)
      _initPersonaServiceProxy();
    return personaService;
  }
  
  public void addPersonaCustom(java.lang.String nome, java.lang.String cognome, java.lang.String mail) throws java.rmi.RemoteException{
    if (personaService == null)
      _initPersonaServiceProxy();
    personaService.addPersonaCustom(nome, cognome, mail);
  }
  
  public it.au.bean.Persona getPersona(int id) throws java.rmi.RemoteException{
    if (personaService == null)
      _initPersonaServiceProxy();
    return personaService.getPersona(id);
  }
  
  public void addPersona(it.au.bean.Persona p1) throws java.rmi.RemoteException{
    if (personaService == null)
      _initPersonaServiceProxy();
    personaService.addPersona(p1);
  }
  
  
}