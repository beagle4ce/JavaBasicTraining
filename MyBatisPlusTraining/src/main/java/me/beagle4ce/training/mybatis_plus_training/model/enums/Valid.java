package me.beagle4ce.training.mybatis_plus_training.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum Valid {

    INVALID(0, "INVALID"),
    VALID(1, "VALID");

    @EnumValue // 通用枚举，指明数据库内存放该枚举的哪个字段
    private int code;

    private String description;

    Valid(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
