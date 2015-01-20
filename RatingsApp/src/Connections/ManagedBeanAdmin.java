package Connections;

public class ManagedBeanAdmin implements java.io.Serializable {
	private String ename;
	private String edescription;
	private String eratings;
	private String ereviews;
	private String mailid;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdescription() {
		return edescription;
	}
	public void setEdescription(String edescription) {
		this.edescription = edescription;
	}
	public String getEratings() {
		return eratings;
	}
	public void setEratings(String eratings) {
		this.eratings = eratings;
	}
	public String getEreviews() {
		return ereviews;
	}
	public void setEreviews(String ereviews) {
		this.ereviews = ereviews;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

}
