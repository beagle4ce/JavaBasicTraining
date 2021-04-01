package pe.beagle.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import pe.beagle.mongo.mongo_document.Clazz;
import pe.beagle.mongo.mongo_document.School;
import pe.beagle.mongo.mongo_document.Student;
import pe.beagle.mongo.utils.IdUtils;

import java.util.HashSet;
import java.util.Set;

@Component
public class MongoTestService {

    @Autowired
    private MongoTemplate template;

    public void insert() {
        Student studentAmy = Student.builder().id(IdUtils.uuid2()).name("Amy").build();
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(studentAmy);

        Clazz clazzA = Clazz.builder().id(IdUtils.uuid2()).name("A").build();
        Set<Clazz> clazzSet = new HashSet<>();
        clazzSet.add(clazzA);


        School school = School.builder().id(IdUtils.uuid2()).schoolName("233_School").studentSet(studentSet).clazzSet(clazzSet).build();
        template.insert(school);
        template.insert(studentAmy);
        template.insert(clazzA);

    }
}
