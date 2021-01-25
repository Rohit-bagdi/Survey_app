package in.cmss.survey.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;


@Document("Questions")
public class Question {

	   @Id
	   @JsonProperty(value="question_id")
	   private int question_id;
	   @JsonProperty(value="question_title")
	   private String question_title;
	@JsonProperty(value="question_type")
	   private String question_type;
	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question_title=" + question_title + ", question_type="
				+ question_type + "]";
	}
	
	
	 public Question() {
			super();
			// TODO Auto-generated constructor stub
		}
	public Question(int question_id, String question_title, String question_type) {
		super();
		this.question_id = question_id;
		this.question_title = question_title;
		this.question_type = question_type;
	}


	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_title() {
		return question_title;
	}
	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
	   
	   
	   
	   
}
