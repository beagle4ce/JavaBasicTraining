package me.beagle4ce.training.mybatis_plus_training.model;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.*;
import lombok.experimental.SuperBuilder;
import me.beagle4ce.training.mybatis_plus_training.model.base.BaseModel;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@TableName(value = "school", autoResultMap = true) // 设置表名,设置是否自动生成resultMap
public class SchoolModel extends BaseModel {


    @Version
    @TableField(value = "school_name", whereStrategy = FieldStrategy.NOT_EMPTY, updateStrategy = FieldStrategy.NOT_NULL)
    private String schoolName;
}
