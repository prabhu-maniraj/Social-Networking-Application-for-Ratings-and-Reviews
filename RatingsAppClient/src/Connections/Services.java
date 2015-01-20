/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connections;

public interface Services extends java.rmi.Remote {
    public java.lang.String updateCategory(java.lang.String ename, java.lang.String edescription, java.lang.String eratings, java.lang.String ereviews, java.lang.String mailid) throws java.rmi.RemoteException;
    public java.lang.String adminCategory(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
    public Connections.ManagedBean signInAdmin(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String signUpUser(java.lang.String firstname, java.lang.String lastname, java.lang.String emailid, java.lang.String password) throws java.rmi.RemoteException;
    public Connections.ManagedBean signInUser(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String deleteCategory(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String createCategory(java.lang.String ename, java.lang.String edescription, java.lang.String eratings, java.lang.String ereviews, java.lang.String mailid) throws java.rmi.RemoteException;
    public java.lang.String viewUserReviews(java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String[] viewAdminCatecory() throws java.rmi.RemoteException;
}
