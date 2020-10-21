package pe.beagle.mongo.mongo_document;


import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

public class BaseMongoDoc {

    @MongoId(value = FieldType.STRING)
    private String serialCode;
}
