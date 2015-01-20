/**
 * ManagedBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connections;

public class ManagedBean  implements java.io.Serializable {
    private java.lang.String emailid;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String logintime;

    private java.lang.String returnmsg;

    public ManagedBean() {
    }

    public ManagedBean(
           java.lang.String emailid,
           java.lang.String firstname,
           java.lang.String lastname,
           java.lang.String logintime,
           java.lang.String returnmsg) {
           this.emailid = emailid;
           this.firstname = firstname;
           this.lastname = lastname;
           this.logintime = logintime;
           this.returnmsg = returnmsg;
    }


    /**
     * Gets the emailid value for this ManagedBean.
     * 
     * @return emailid
     */
    public java.lang.String getEmailid() {
        return emailid;
    }


    /**
     * Sets the emailid value for this ManagedBean.
     * 
     * @param emailid
     */
    public void setEmailid(java.lang.String emailid) {
        this.emailid = emailid;
    }


    /**
     * Gets the firstname value for this ManagedBean.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this ManagedBean.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the lastname value for this ManagedBean.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this ManagedBean.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the logintime value for this ManagedBean.
     * 
     * @return logintime
     */
    public java.lang.String getLogintime() {
        return logintime;
    }


    /**
     * Sets the logintime value for this ManagedBean.
     * 
     * @param logintime
     */
    public void setLogintime(java.lang.String logintime) {
        this.logintime = logintime;
    }


    /**
     * Gets the returnmsg value for this ManagedBean.
     * 
     * @return returnmsg
     */
    public java.lang.String getReturnmsg() {
        return returnmsg;
    }


    /**
     * Sets the returnmsg value for this ManagedBean.
     * 
     * @param returnmsg
     */
    public void setReturnmsg(java.lang.String returnmsg) {
        this.returnmsg = returnmsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedBean)) return false;
        ManagedBean other = (ManagedBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailid==null && other.getEmailid()==null) || 
             (this.emailid!=null &&
              this.emailid.equals(other.getEmailid()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.logintime==null && other.getLogintime()==null) || 
             (this.logintime!=null &&
              this.logintime.equals(other.getLogintime()))) &&
            ((this.returnmsg==null && other.getReturnmsg()==null) || 
             (this.returnmsg!=null &&
              this.returnmsg.equals(other.getReturnmsg())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEmailid() != null) {
            _hashCode += getEmailid().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getLogintime() != null) {
            _hashCode += getLogintime().hashCode();
        }
        if (getReturnmsg() != null) {
            _hashCode += getReturnmsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Connections", "ManagedBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connections", "emailid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connections", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connections", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logintime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connections", "logintime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connections", "returnmsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
