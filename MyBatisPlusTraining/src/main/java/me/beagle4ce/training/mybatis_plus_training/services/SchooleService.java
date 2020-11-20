package me.beagle4ce.training.mybatis_plus_training.services;

import com.baomidou.mybatisplus.core.metadata.IPage;
import me.beagle4ce.training.mybatis_plus_training.mappers.SchoolMapper;
import me.beagle4ce.training.mybatis_plus_training.model.SchoolModel;
import me.beagle4ce.training.mybatis_plus_training.model.enums.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SchooleService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    // 因为傻瓜IDEA在这里不知道Mybatis会生成impl对象，所以老是要报错，故使用上面的注解消除红线～～～嗯～～～强迫症 ：）
    @Autowired
    private SchoolMapper schoolMapper;

    public void saveTest() {
        LocalDateTime now = LocalDateTime.now();
        SchoolModel schoolModel = SchoolModel.builder()
                .schoolName("Mybatis plus school")
                .createdTime(now)
                .updatedTime(now)
                .valid(Valid.VALID)
                .build();
        int count = schoolMapper.insert(schoolModel);
    }

    public void delTest() {
        schoolMapper.deleteById("ac5219a5b52da60a3a51d0eda4148348");
    }

    public void pageTest() {
//        IPage<SchoolModel> iPage = schoolMapper.selectPage();

    }
}
