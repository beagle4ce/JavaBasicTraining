package pe.beagle.jpa.jpacasecadetest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import pe.beagle.jpa.jpacasecadetest.domains.SchoolEntity;

@Component
public class JDBCTestService {

    @Autowired
    private JdbcTemplate template;

    public void save() {
        SchoolEntity schoolEntity = template.queryForObject("", SchoolEntity.class);

    }
}
