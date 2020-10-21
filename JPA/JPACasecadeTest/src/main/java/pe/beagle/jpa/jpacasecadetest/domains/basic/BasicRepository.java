package pe.beagle.jpa.jpacasecadetest.domains.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import pe.beagle.jpa.jpacasecadetest.constants.Valid;

import java.util.List;

/**
 * TIME:2020-03-04 09:37
 * Author:LLH
 * PROJECT:StrategicDecision
 */
@NoRepositoryBean
public interface BasicRepository<ENTITY extends BasicEntity> extends JpaRepository<ENTITY, String>, JpaSpecificationExecutor<ENTITY> {



    List<ENTITY> findByValid(Valid valid);

    ENTITY findBySerialCodeAndValid(String serialCode, Valid valid);

    ENTITY findBySerialCode(String serialCode);
}
