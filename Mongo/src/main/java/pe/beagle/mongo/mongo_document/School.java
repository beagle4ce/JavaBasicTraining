package pe.beagle.mongo.mongo_document;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Document(value = "school")
public class School extends BaseMongoDoc {

    @Indexed
    @Field("school_name")
    private String schoolName;

    @Indexed
    @DBRef
    @Field("students")
    private Set<Student> studentSet;

    @Indexed
    @Field("clazzs")
    private Set<Clazz> clazzSet;
}
