package in.cmss.survey.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.cmss.survey.model.Answers;
import in.cmss.survey.model.Question;
import in.cmss.survey.repositories.QuestionsRepository;

@RestController
@RequestMapping("/Question")

public class QuestionController {
	
	@Autowired
	private QuestionsRepository QuestionRepository;

	
	@PostMapping(path="/save", headers = "Accept=application/json")
	public Question Addtodatabase(@RequestBody Question question)  {
	System.out.println(question);
	//ModelMapper modelMapper = new ModelMapper();
	// user here is a prepopulated User instance
	//Question  userDTO = modelMapper.map(question, Question.class);
	
		try {
				 
			QuestionRepository.save(question);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  question;

	}

	@PostMapping("/view")
	public List<Question> view() {
		List<Question> Answers = QuestionRepository.findAll();

		return Answers;

	}

	
}
