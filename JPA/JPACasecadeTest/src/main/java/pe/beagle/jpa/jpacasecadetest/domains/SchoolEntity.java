package pe.beagle.jpa.jpacasecadetest.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Where;
import pe.beagle.jpa.jpacasecadetest.domains.basic.BasicEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * TIME:2020-03-11 11:02
 * Author:LLH
 * PROJECT:StrategicDecision
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@Entity
@Table(name = "school")
public class SchoolEntity extends BasicEntity {

    @Column(name = "school_name")
    private String schoolName;

    @Where(clause = "valid = 1")
    @OneToMany(cascade = {CascadeType.ALL},
            orphanRemoval = true) // orphanRemoval = true 含义是删除掉本次更新中没包含进的子对象
    // mappedBy 含义是关系交给谁来维护，若是School来维护，则不需要mappedBy
    @JoinColumn(name = "school_serial_code") // 加了这一段可实现一对多级联保存
    private Set<StudentEntity> studentEntities;

    /*@Where(clause = "valid = 1")
    @OneToMany(mappedBy = "schoolEntity", cascade = {CascadeType.ALL},
            orphanRemoval = true) // orphanRemoval = true 含义是删除掉本次更新中没包含进的子对象
    // mappedBy 含义是关系交给谁来维护，若是School来维护，则不需要mappedBy
    private Set<StudentEntity> studentEntities;*/
}
