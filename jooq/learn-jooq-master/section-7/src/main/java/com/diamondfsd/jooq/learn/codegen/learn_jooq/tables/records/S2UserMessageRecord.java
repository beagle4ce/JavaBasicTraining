/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records;


import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.TS2UserMessage;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces.IS2UserMessage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户消息内容
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S2UserMessageRecord extends UpdatableRecordImpl<S2UserMessageRecord> implements Record6<Integer, Integer, String, String, Timestamp, Timestamp>, IS2UserMessage {

    private static final long serialVersionUID = 1059430013;

    /**
     * Setter for <code>learn-jooq.s2_user_message.id</code>.
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn-jooq.s2_user_message.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn-jooq.s2_user_message.user_id</code>.
     */
    @Override
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn-jooq.s2_user_message.user_id</code>.
     */
    @Override
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>learn-jooq.s2_user_message.message_title</code>. 消息标题
     */
    @Override
    public void setMessageTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn-jooq.s2_user_message.message_title</code>. 消息标题
     */
    @Override
    public String getMessageTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>learn-jooq.s2_user_message.message_content</code>. 消息内容
     */
    @Override
    public void setMessageContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn-jooq.s2_user_message.message_content</code>. 消息内容
     */
    @Override
    public String getMessageContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>learn-jooq.s2_user_message.create_time</code>. 创建时间
     */
    @Override
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn-jooq.s2_user_message.create_time</code>. 创建时间
     */
    @Override
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>learn-jooq.s2_user_message.update_time</code>. 更新时间
     */
    @Override
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn-jooq.s2_user_message.update_time</code>. 更新时间
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
    public Row6<Integer, Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TS2UserMessage.S2_USER_MESSAGE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return TS2UserMessage.S2_USER_MESSAGE.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return TS2UserMessage.S2_USER_MESSAGE.MESSAGE_TITLE;
    }

    @Override
    public Field<String> field4() {
        return TS2UserMessage.S2_USER_MESSAGE.MESSAGE_CONTENT;
    }

    @Override
    public Field<Timestamp> field5() {
        return TS2UserMessage.S2_USER_MESSAGE.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field6() {
        return TS2UserMessage.S2_USER_MESSAGE.UPDATE_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getMessageTitle();
    }

    @Override
    public String component4() {
        return getMessageContent();
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
    public Integer value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getMessageTitle();
    }

    @Override
    public String value4() {
        return getMessageContent();
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
    public S2UserMessageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public S2UserMessageRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public S2UserMessageRecord value3(String value) {
        setMessageTitle(value);
        return this;
    }

    @Override
    public S2UserMessageRecord value4(String value) {
        setMessageContent(value);
        return this;
    }

    @Override
    public S2UserMessageRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public S2UserMessageRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public S2UserMessageRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5, Timestamp value6) {
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
    public void from(IS2UserMessage from) {
        setId(from.getId());
        setUserId(from.getUserId());
        setMessageTitle(from.getMessageTitle());
        setMessageContent(from.getMessageContent());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
    }

    @Override
    public <E extends IS2UserMessage> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached S2UserMessageRecord
     */
    public S2UserMessageRecord() {
        super(TS2UserMessage.S2_USER_MESSAGE);
    }

    /**
     * Create a detached, initialised S2UserMessageRecord
     */
    public S2UserMessageRecord(Integer id, Integer userId, String messageTitle, String messageContent, Timestamp createTime, Timestamp updateTime) {
        super(TS2UserMessage.S2_USER_MESSAGE);

        set(0, id);
        set(1, userId);
        set(2, messageTitle);
        set(3, messageContent);
        set(4, createTime);
        set(5, updateTime);
    }
}
