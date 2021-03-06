package in.cmss.survey.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.cmss.survey.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, Integer> {

	public UserModel findById(String id);

	public void deleteById(int user_id);

	 
}
