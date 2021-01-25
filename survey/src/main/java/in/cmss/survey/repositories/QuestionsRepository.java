package in.cmss.survey.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.cmss.survey.model.Question;

public interface QuestionsRepository extends MongoRepository<Question,Integer> {

}
