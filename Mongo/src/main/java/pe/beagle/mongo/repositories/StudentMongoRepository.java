package pe.beagle.mongo.repositories;

import org.springframework.stereotype.Repository;
import pe.beagle.mongo.mongo_document.Student;

@Repository
public interface StudentMongoRepository extends BaseMongoRepository<Student> {
}
