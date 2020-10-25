package me.beagle4ce.training.mybatis_plus_training.services;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.beagle4ce.training.mybatis_plus_training.mappers.SchoolMapper;
import me.beagle4ce.training.mybatis_plus_training.model.SchoolModel;
import org.springframework.stereotype.Component;

@Component
public class SchooleService extends ServiceImpl<SchoolMapper, SchoolModel> {

    public void testPage() {
        Page<SchoolModel> schoolModelIPage = new Page<SchoolModel>();
        schoolModelIPage.setCurrent(1L);
        schoolModelIPage.setSize(10L);
        schoolModelIPage.setOrders(OrderItem.descs("created_time"));
        Page<SchoolModel> schoolModelPage = page(schoolModelIPage);
        System.out.println("total:"+schoolModelPage.getTotal());
        System.out.println("pages:"+schoolModelPage.getPages());
        System.out.println(schoolModelPage.getRecords().size());
    }
}
