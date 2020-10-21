package pe.beagle.jpa.jpacasecadetest.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLDelete;
import pe.beagle.jpa.jpacasecadetest.domains.basic.BasicEntity;

import javax.persistence.*;

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
@Table(name = "student")
@SQLDelete(sql = "UPDATE `student` SET `valid`=0 WHERE `serial_code`=?")
public class StudentEntity extends BasicEntity {

    @Column(name = "student_name")
    private String studentName;


    // Cascade指的是StudentEntity可以对SchoolEntity进行些什么操作,操作可以是联合起来的，
    // 比如：CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH 之间相互并不冲突，而是互补关系
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "school_serial_code", referencedColumnName = "serial_code")
    private SchoolEntity schoolEntity;
}
