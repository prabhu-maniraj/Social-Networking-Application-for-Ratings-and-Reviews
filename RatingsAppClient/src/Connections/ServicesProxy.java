package Connections;

public class ServicesProxy implements Connections.Services {
  private String _endpoint = null;
  private Connections.Services services = null;
  
  public ServicesProxy() {
    _initServicesProxy();
  }
  
  public ServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicesProxy();
  }
  
  private void _initServicesProxy() {
    try {
      services = (new Connections.ServicesServiceLocator()).getServices();
      if (services != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)services)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (services != null)
      ((javax.xml.rpc.Stub)services)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Connections.Services getServices() {
    if (services == null)
      _initServicesProxy();
    return services;
  }
  
  public java.lang.String updateCategory(java.lang.String ename, java.lang.String edescription, java.lang.String eratings, java.lang.String ereviews, java.lang.String mailid) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.updateCategory(ename, edescription, eratings, ereviews, mailid);
  }
  
  public java.lang.String adminCategory(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.adminCategory(username, pwd);
  }
  
  public Connections.ManagedBean signInAdmin(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.signInAdmin(username, pwd);
  }
  
  public java.lang.String signUpUser(java.lang.String firstname, java.lang.String lastname, java.lang.String emailid, java.lang.String password) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.signUpUser(firstname, lastname, emailid, password);
  }
  
  public Connections.ManagedBean signInUser(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.signInUser(username, pwd);
  }
  
  public java.lang.String deleteCategory(java.lang.String name) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.deleteCategory(name);
  }
  
  public java.lang.String createCategory(java.lang.String ename, java.lang.String edescription, java.lang.String eratings, java.lang.String ereviews, java.lang.String mailid) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.createCategory(ename, edescription, eratings, ereviews, mailid);
  }
  
  public java.lang.String viewUserReviews(java.lang.String email) throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.viewUserReviews(email);
  }
  
  public java.lang.String[] viewAdminCatecory() throws java.rmi.RemoteException{
    if (services == null)
      _initServicesProxy();
    return services.viewAdminCatecory();
  }
  
  
}