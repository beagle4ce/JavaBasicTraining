package pe.beagle.mongo.configs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.*;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * Created by LLH
 * on 2018-11-08 09:58.
 */
@Configuration
public class MongoConfig {

    /**
     * 去除Spring Data MongoDB 默认建表语句中的_class字段
     * @param mongoDatabaseFactory
     * @param context
     * @param beanFactory
     * @return
     */
    @Bean
    public MappingMongoConverter mappingMongoConverter(MongoDatabaseFactory mongoDatabaseFactory, MongoMappingContext context, BeanFactory beanFactory) {
        DbRefResolver resolver = new DefaultDbRefResolver(mongoDatabaseFactory);
        MappingMongoConverter converter = new MappingMongoConverter(resolver, context);
        converter.setCustomConversions(beanFactory.getBean(MongoCustomConversions.class));
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return converter;
    }

    @Bean
    public MongoMappingContext mongoMappingContext(){
        MongoMappingContext mongoMappingContext = new MongoMappingContext();
        mongoMappingContext.setAutoIndexCreation(false);
        return mongoMappingContext;
    }

    @Bean(name = "mongoTemplate")
    public MongoTemplate mongoTemplate(MongoDatabaseFactory mongoDatabaseFactory){
        return new MongoTemplate(mongoDatabaseFactory);
    }

}
