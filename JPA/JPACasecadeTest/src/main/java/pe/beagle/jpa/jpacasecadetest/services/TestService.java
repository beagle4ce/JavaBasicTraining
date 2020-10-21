package pe.beagle.jpa.jpacasecadetest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import pe.beagle.jpa.jpacasecadetest.constants.Valid;
import pe.beagle.jpa.jpacasecadetest.domains.SchoolEntity;
import pe.beagle.jpa.jpacasecadetest.domains.SchoolRepository;
import pe.beagle.jpa.jpacasecadetest.domains.StudentEntity;
import pe.beagle.jpa.jpacasecadetest.domains.StudentRepository;

import javax.persistence.criteria.Predicate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class TestService {

    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private StudentRepository studentRepository;

    /**
     * 一对多级联保存
     */
    public void o2mPersist() {
        LocalDateTime now = LocalDateTime.now();


        Set<StudentEntity> studentEntitySet = new HashSet<>();
        studentEntitySet.add(StudentEntity.builder()
                .studentName("David3")
                .valid(Valid.VALID)
                .createdTime(now)
                .build());
        studentEntitySet.add(StudentEntity.builder()
                .studentName("Veronica3")
                .valid(Valid.VALID)
                .createdTime(now)
                .build());

        SchoolEntity schoolEntity = SchoolEntity.builder()
                //.serialCode(IdUtils.generatedID()) // 预先设置ID无用
                .schoolName("XSchool2")
                .studentEntities(studentEntitySet)
                .valid(Valid.VALID)
                .createdTime(now)
                .build();

        SchoolEntity schoolEntityResult = schoolRepository.save(schoolEntity);

    }

    /**
     * 多对一级联保存
     */
    public void m2oPersist() {
        LocalDateTime now = LocalDateTime.now();

        SchoolEntity schoolEntity = SchoolEntity.builder()
                .schoolName("XSchool")
                .valid(Valid.VALID)
                .createdTime(now)
                .build();


        List<StudentEntity> studentEntities = new ArrayList<>();
        studentEntities.add(StudentEntity.builder()
                .studentName("David")
                .valid(Valid.VALID)
                .createdTime(now)
                .schoolEntity(schoolEntity)
                .build());
        studentEntities.add(StudentEntity.builder()
                .studentName("Veronica")
                .valid(Valid.VALID)
                .createdTime(now)
                .schoolEntity(schoolEntity)
                .build());

        List<StudentEntity> studentEntityList = studentRepository.saveAll(studentEntities);

    }


    /**
     * 一对多级联保存更新
     */
    public void o2mUpdate() {
        LocalDateTime now = LocalDateTime.now();

        SchoolEntity schoolEntity = SchoolEntity.builder()
                .serialCode("4028e5de7454205f0174542062fa0000")
                .schoolName("XSchool")
                .valid(Valid.VALID)
                .createdTime(now)
                .updatedTime(now)
                .build();


        Set<StudentEntity> studentEntitySet = new HashSet<>();
        studentEntitySet.add(StudentEntity.builder()
                .studentName("Tom2")
                .valid(Valid.VALID)
                .createdTime(now)
                .build());
        studentEntitySet.add(StudentEntity.builder()
                .serialCode("4028e5de7454205f01745420630f0001")
                .schoolEntity(schoolEntity)
                .studentName("Veronica")
                .valid(Valid.VALID)
                .createdTime(now)
                .updatedTime(now)
                .build());

        schoolEntity.setStudentEntities(studentEntitySet);

        SchoolEntity schoolEntityResult = schoolRepository.save(schoolEntity);

    }

    /**
     * 一对多级联保存更新
     */
    public void m2oUpdate() {
        LocalDateTime now = LocalDateTime.now();
        Set<StudentEntity> studentEntitySet = new HashSet<>();
        studentEntitySet.add(StudentEntity.builder()
                .studentName("David")
                .valid(Valid.VALID)
                .createdTime(now)
                .build());


        StudentEntity studentEntity = studentRepository.findBySerialCode("4028e5de742db7f201742db7f5d40002");


        studentEntitySet.add(studentEntity.toBuilder()
                .studentName("Veronica2")
                .valid(Valid.VALID)
                .updatedTime(now)
                .build());



        SchoolEntity schoolEntity = SchoolEntity.builder()
                //.serialCode(IdUtils.generatedID()) // 预先设置ID无用
                .schoolName("XSchool")
                .valid(Valid.VALID)
                .createdTime(now)
                .studentEntities(studentEntitySet)
                .build();

        SchoolEntity schoolEntity2 = schoolRepository.save(schoolEntity);

    }

    public void test() {
        Specification spec = (root,criteriaQuery,criteriaBuilder) -> {
            criteriaBuilder.createQuery().groupBy()

            return criteriaBuilder.and(
                    criteriaQuery.groupBy(
                            criteriaBuilder.equal(root.get(""), ""))
                            .getGroupRestriction());
        };
    }
}
