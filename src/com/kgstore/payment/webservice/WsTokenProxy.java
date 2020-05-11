package com.kgstore.payment.webservice;

public class WsTokenProxy implements com.kgstore.payment.webservice.WsToken {
  private String _endpoint = null;
  private com.kgstore.payment.webservice.WsToken wsToken = null;
  
  public WsTokenProxy() {
    _initWsTokenProxy();
  }
  
  public WsTokenProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsTokenProxy();
  }
  
  private void _initWsTokenProxy() {
    try {
      wsToken = (new com.kgstore.payment.webservice.WsTokenServiceLocator()).getWsToken();
      if (wsToken != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsToken)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsToken)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsToken != null)
      ((javax.xml.rpc.Stub)wsToken)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.kgstore.payment.webservice.WsToken getWsToken() {
    if (wsToken == null)
      _initWsTokenProxy();
    return wsToken;
  }
  
  public java.lang.String getToken(java.lang.String name) throws java.rmi.RemoteException{
    if (wsToken == null)
      _initWsTokenProxy();
    return wsToken.getToken(name);
  }
  
  
}