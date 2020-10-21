package pe.beagle.jpa.jpacasecadetest.domains.basic;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import pe.beagle.jpa.jpacasecadetest.constants.Valid;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * TIME:2020-03-03 09:35
 * Author:LLH
 * PROJECT:StrategicDecision
 * DESC: 关系型数据库ORM基础类,不可单独实例,需继承实现后实例化
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@SuperBuilder(toBuilder = true)
@MappedSuperclass
public abstract class BasicEntity implements Serializable {

    /**
     * 主键字段使用UUID作为主键
     */
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "serial_code", length = 32)
    private String serialCode;

    /**
     * 行数据有效性, 0:无效 1:有效 默认1
     */
    @Column
    @Enumerated(value = EnumType.ORDINAL)
    private Valid valid;

    /**
     * 行数据创建时间 格式为: yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "created_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // LocalDateTime 必须写完整的yyyy-MM-dd HH:mm:ss 否则无法映射进LocalDateTime对象
    @CreatedDate
    private LocalDateTime createdTime;

    /**
     * 行数据最后更新时间 格式为: yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "updated_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // LocalDateTime 必须写完整的yyyy-MM-dd HH:mm:ss 否则无法映射进LocalDateTime对象
    @LastModifiedDate
    private LocalDateTime updatedTime;
}
