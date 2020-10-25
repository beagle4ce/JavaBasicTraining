package me.beagle4ce.training.mybatis_plus_training.services;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import me.beagle4ce.training.mybatis_plus_training.model.base.BaseModel;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public interface BaseService<M extends BaseModel> extends IService<M> {

    @Override
    default boolean saveBatch(Collection<M> entityList, int batchSize) {
        return false;
    }

    @Override
    default boolean saveOrUpdateBatch(Collection<M> entityList, int batchSize) {
        return false;
    }

    @Override
    default boolean updateBatchById(Collection<M> entityList, int batchSize) {
        return false;
    }

    @Override
    default boolean saveOrUpdate(M entity) {
        return false;
    }

    @Override
    default M getOne(Wrapper<M> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    default Map<String, Object> getMap(Wrapper<M> queryWrapper) {
        return null;
    }

    @Override
    default <V> V getObj(Wrapper<M> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    default BaseMapper<M> getBaseMapper() {
        return null;
    }
}
