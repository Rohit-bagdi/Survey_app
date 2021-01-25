package in.cmss.survey.repositories;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.cmss.survey.model.CustomerModel;

public interface CustomerRepository extends MongoRepository<CustomerModel, Integer> {

 
	public Optional<CustomerModel> findById(int  client_id);

	public void deleteById(int  client_id);
	
}
