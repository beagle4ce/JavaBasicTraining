package me.beagle4ce.training.mybatis_plus_training.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.beagle4ce.training.mybatis_plus_training.model.SchoolModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolMapper extends BaseMapper<SchoolModel> {
}
