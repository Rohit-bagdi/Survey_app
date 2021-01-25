package in.cmss.survey.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Getter@Setter@ToString
@Document(collection = "Customer")
public class CustomerModel {
	
	@Id
	private int client_id;                                           
    private int company_id;
    private String company_name;
    private String company_description;
    
    private String client_name;
    private String client_type;
    private String client_email_id;
    private long client_contact;
    
    private Date client_create_on;
    private Date client_update_on;
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_description() {
		return company_description;
	}
	public void setCompany_description(String company_description) {
		this.company_description = company_description;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getClient_type() {
		return client_type;
	}
	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}
	public String getClient_email_id() {
		return client_email_id;
	}
	public void setClient_email_id(String client_email_id) {
		this.client_email_id = client_email_id;
	}
	public long getClient_contact() {
		return client_contact;
	}
	public void setClient_contact(long client_contact) {
		this.client_contact = client_contact;
	}
	public Date getClient_create_on() {
		return client_create_on;
	}
	public void setClient_create_on(Date client_create_on) {
		this.client_create_on = client_create_on;
	}
	public Date getClient_update_on() {
		return client_update_on;
	}
	public void setClient_update_on(Date client_update_on) {
		this.client_update_on = client_update_on;
	}
	public CustomerModel(int company_id, String company_name, String company_description, int client_id,
			String client_name, String client_type, String client_email_id, long client_contact, Date client_create_on,
			Date client_update_on) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.company_description = company_description;
		this.client_id = client_id;
		this.client_name = client_name;
		this.client_type = client_type;
		this.client_email_id = client_email_id;
		this.client_contact = client_contact;
		this.client_create_on = client_create_on;
		this.client_update_on = client_update_on;
	}
	
	
	@Override
	public String toString() {
		return "CustomerModel [company_id=" + company_id + ", company_name=" + company_name + ", company_description="
				+ company_description + ", client_id=" + client_id + ", client_name=" + client_name + ", client_type="
				+ client_type + ", client_email_id=" + client_email_id + ", client_contact=" + client_contact
				+ ", client_create_on=" + client_create_on + ", client_update_on=" + client_update_on + "]";
	}
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
   
    
    
    
    
    
    
    


}
