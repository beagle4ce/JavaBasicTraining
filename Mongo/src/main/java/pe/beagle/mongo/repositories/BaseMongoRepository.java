package pe.beagle.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import pe.beagle.mongo.mongo_document.BaseMongoDoc;

@NoRepositoryBean
public interface BaseMongoRepository<D extends BaseMongoDoc> extends MongoRepository<D, String> {
}
