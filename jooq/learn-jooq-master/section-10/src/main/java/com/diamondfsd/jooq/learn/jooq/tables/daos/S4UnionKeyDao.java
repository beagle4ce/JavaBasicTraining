/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq.tables.daos;


import com.diamondfsd.jooq.learn.extend.ExtendDAOImpl;
import com.diamondfsd.jooq.learn.jooq.tables.TS4UnionKey;
import com.diamondfsd.jooq.learn.jooq.tables.records.S4UnionKeyRecord;
import com.diamondfsd.jooq.learn.entity.S4UnionKey;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class S4UnionKeyDao extends ExtendDAOImpl<S4UnionKeyRecord, S4UnionKey, Record2<Integer, Integer>> {

    /**
     * Create a new S4UnionKeyDao without any configuration
     */
    public S4UnionKeyDao() {
        super(TS4UnionKey.S4_UNION_KEY, S4UnionKey.class);
    }

    /**
     * Create a new S4UnionKeyDao with an attached configuration
     */
    @Autowired
    public S4UnionKeyDao(Configuration configuration) {
        super(TS4UnionKey.S4_UNION_KEY, S4UnionKey.class, configuration);
    }

    @Override
    public Record2<Integer, Integer> getId(S4UnionKey object) {
        return compositeKeyRecord(object.getUk_1(), object.getUk_2());
    }

    /**
     * Fetch records that have <code>uk_1 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S4UnionKey> fetchRangeOfUk_1(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TS4UnionKey.S4_UNION_KEY.UK_1, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>uk_1 IN (values)</code>
     */
    public List<S4UnionKey> fetchByUk_1(Integer... values) {
        return fetch(TS4UnionKey.S4_UNION_KEY.UK_1, values);
    }

    /**
     * Fetch records that have <code>uk_2 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S4UnionKey> fetchRangeOfUk_2(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TS4UnionKey.S4_UNION_KEY.UK_2, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>uk_2 IN (values)</code>
     */
    public List<S4UnionKey> fetchByUk_2(Integer... values) {
        return fetch(TS4UnionKey.S4_UNION_KEY.UK_2, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S4UnionKey> fetchRangeOfCreateTime(Timestamp lowerInclusive, Timestamp upperInclusive) {
        return fetchRange(TS4UnionKey.S4_UNION_KEY.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<S4UnionKey> fetchByCreateTime(Timestamp... values) {
        return fetch(TS4UnionKey.S4_UNION_KEY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S4UnionKey> fetchRangeOfUpdateTime(Timestamp lowerInclusive, Timestamp upperInclusive) {
        return fetchRange(TS4UnionKey.S4_UNION_KEY.UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<S4UnionKey> fetchByUpdateTime(Timestamp... values) {
        return fetch(TS4UnionKey.S4_UNION_KEY.UPDATE_TIME, values);
    }
}