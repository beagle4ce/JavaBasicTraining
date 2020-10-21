package me.beagle4ce.training.mybatis_plus_training.model.base;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import me.beagle4ce.training.mybatis_plus_training.model.enums.Valid;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class BaseModel {

    @TableId(value = "serial_code", type = IdType.ASSIGN_UUID) // 设置主键名，主键策略
    private  String serialCode;

    // 设置绑定数据库内的字段名，填充规则，查询策略(非String类型的对象只能使用NOT_NULL)
    @TableField(value = "updated_time", fill = FieldFill.INSERT_UPDATE, whereStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updatedTime;

    @TableField(value = "created_time", fill = FieldFill.INSERT, whereStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createdTime;

    // 对应Valid枚举对象内的特定字段上设置了EnumValue注解，标注这是一个通用枚举类用于下列字段作为枚举类型
    @TableLogic // 设置好逻辑删除的值 value是未删除时的值，delval是删除状态的值
    @TableField(value = "valid", whereStrategy = FieldStrategy.NOT_NULL, fill = FieldFill.UPDATE)
    private Valid valid;
}
