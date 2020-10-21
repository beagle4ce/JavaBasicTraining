package pe.beagle.mongo.mongo_document;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "student")
public class Student extends BaseMongoDoc {

    @Indexed
    @Field(value = "s_name")
    private String name;
}
