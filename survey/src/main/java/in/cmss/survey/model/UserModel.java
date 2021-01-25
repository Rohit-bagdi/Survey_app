package in.cmss.survey.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "User")
public class UserModel {
	@Id
	private int id;
	private int user_id;
	private String user_name;
	private String user_password;
	private String user_type;
	private String user_email_id;
	private String user_contact;
	private Date user_create_on;
	private Date user_update_on;
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", user_id=" + user_id + ", user_name=" + user_name + ", user_password="
				+ user_password + ", user_type=" + user_type + ", user_email_id=" + user_email_id + ", user_contact="
				+ user_contact + ", user_create_on=" + user_create_on + ", user_update_on=" + user_update_on + "]";
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_email_id() {
		return user_email_id;
	}
	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public Date getUser_create_on() {
		return user_create_on;
	}
	public void setUser_create_on(Date user_create_on) {
		this.user_create_on = user_create_on;
	}
	public Date getUser_update_on() {
		return user_update_on;
	}
	public void setUser_update_on(Date user_update_on) {
		this.user_update_on = user_update_on;
	}
	
	
	 
	 

	 
}
