package pe.beagle.jpa.jpacasecadetest.domains;

import org.springframework.stereotype.Repository;
import pe.beagle.jpa.jpacasecadetest.domains.basic.BasicRepository;

@Repository
public interface StudentRepository extends BasicRepository<StudentEntity> {
}
