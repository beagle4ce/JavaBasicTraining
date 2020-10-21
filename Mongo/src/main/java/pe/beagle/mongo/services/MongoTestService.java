package pe.beagle.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import pe.beagle.mongo.repositories.StudentMongoRepository;

@Component
public class MongoTestService {

    @Autowired
    private MongoTemplate template;
    @Autowired
    private StudentMongoRepository studentMongoRepository;

    public void test() {

    }
}
