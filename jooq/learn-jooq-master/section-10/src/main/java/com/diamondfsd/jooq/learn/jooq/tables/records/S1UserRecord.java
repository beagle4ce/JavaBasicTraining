/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq.tables.records;


import com.diamondfsd.jooq.learn.jooq.tables.TS1User;
import com.diamondfsd.jooq.learn.jooq.tables.interfaces.IS1User;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * USER TABLE
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S1UserRecord extends UpdatableRecordImpl<S1UserRecord> implements Record6<Integer, String, String, String, Timestamp, Timestamp>, IS1User {

    private static final long serialVersionUID = -43023497;

    /**
     * Setter for <code>learn-jooq.s1_user.id</code>. ID
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn-jooq.s1_user.id</code>. ID
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn-jooq.s1_user.username</code>.
     */
    @Override
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn-jooq.s1_user.username</code>.
     */
    @Override
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn-jooq.s1_user.email</code>.
     */
    @Override
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn-jooq.s1_user.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>learn-jooq.s1_user.address</code>.
     */
    @Override
    public void setAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn-jooq.s1_user.address</code>.
     */
    @Override
    public String getAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>learn-jooq.s1_user.create_time</code>.
     */
    @Override
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn-jooq.s1_user.create_time</code>.
     */
    @Override
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>learn-jooq.s1_user.update_time</code>.
     */
    @Override
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn-jooq.s1_user.update_time</code>.
     */
    @Override
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TS1User.S1_USER.ID;
    }

    @Override
    public Field<String> field2() {
        return TS1User.S1_USER.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return TS1User.S1_USER.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return TS1User.S1_USER.ADDRESS;
    }

    @Override
    public Field<Timestamp> field5() {
        return TS1User.S1_USER.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field6() {
        return TS1User.S1_USER.UPDATE_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getAddress();
    }

    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    @Override
    public Timestamp component6() {
        return getUpdateTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getAddress();
    }

    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    @Override
    public S1UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public S1UserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public S1UserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public S1UserRecord value4(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public S1UserRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public S1UserRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public S1UserRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IS1User from) {
        setId(from.getId());
        setUsername(from.getUsername());
        setEmail(from.getEmail());
        setAddress(from.getAddress());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
    }

    @Override
    public <E extends IS1User> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached S1UserRecord
     */
    public S1UserRecord() {
        super(TS1User.S1_USER);
    }

    /**
     * Create a detached, initialised S1UserRecord
     */
    public S1UserRecord(Integer id, String username, String email, String address, Timestamp createTime, Timestamp updateTime) {
        super(TS1User.S1_USER);

        set(0, id);
        set(1, username);
        set(2, email);
        set(3, address);
        set(4, createTime);
        set(5, updateTime);
    }
}
