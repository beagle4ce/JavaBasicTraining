/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq.tables;


import com.diamondfsd.jooq.learn.codegen.learn_jooq.Indexes;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.Keys;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.LearnJooq;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records.S2UserMessageRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TS2UserMessage extends TableImpl<S2UserMessageRecord> {

    private static final long serialVersionUID = 315605242;

    /**
     * The reference instance of <code>learn-jooq.s2_user_message</code>
     */
    public static final TS2UserMessage S2_USER_MESSAGE = new TS2UserMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<S2UserMessageRecord> getRecordType() {
        return S2UserMessageRecord.class;
    }

    /**
     * The column <code>learn-jooq.s2_user_message.id</code>.
     */
    public final TableField<S2UserMessageRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>learn-jooq.s2_user_message.user_id</code>.
     */
    public final TableField<S2UserMessageRecord, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>learn-jooq.s2_user_message.message_title</code>. 消息标题
     */
    public final TableField<S2UserMessageRecord, String> MESSAGE_TITLE = createField(DSL.name("message_title"), org.jooq.impl.SQLDataType.VARCHAR(60), this, "消息标题");

    /**
     * The column <code>learn-jooq.s2_user_message.message_content</code>. 消息内容
     */
    public final TableField<S2UserMessageRecord, String> MESSAGE_CONTENT = createField(DSL.name("message_content"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "消息内容");

    /**
     * The column <code>learn-jooq.s2_user_message.create_time</code>. 创建时间
     */
    public final TableField<S2UserMessageRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>learn-jooq.s2_user_message.update_time</code>. 更新时间
     */
    public final TableField<S2UserMessageRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>learn-jooq.s2_user_message</code> table reference
     */
    public TS2UserMessage() {
        this(DSL.name("s2_user_message"), null);
    }

    /**
     * Create an aliased <code>learn-jooq.s2_user_message</code> table reference
     */
    public TS2UserMessage(String alias) {
        this(DSL.name(alias), S2_USER_MESSAGE);
    }

    /**
     * Create an aliased <code>learn-jooq.s2_user_message</code> table reference
     */
    public TS2UserMessage(Name alias) {
        this(alias, S2_USER_MESSAGE);
    }

    private TS2UserMessage(Name alias, Table<S2UserMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private TS2UserMessage(Name alias, Table<S2UserMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户消息内容"));
    }

    public <O extends Record> TS2UserMessage(Table<O> child, ForeignKey<O, S2UserMessageRecord> key) {
        super(child, key, S2_USER_MESSAGE);
    }

    @Override
    public Schema getSchema() {
        return LearnJooq.LEARN_JOOQ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.S2_USER_MESSAGE_PRIMARY);
    }

    @Override
    public Identity<S2UserMessageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_S2_USER_MESSAGE;
    }

    @Override
    public UniqueKey<S2UserMessageRecord> getPrimaryKey() {
        return Keys.KEY_S2_USER_MESSAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<S2UserMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<S2UserMessageRecord>>asList(Keys.KEY_S2_USER_MESSAGE_PRIMARY);
    }

    @Override
    public TS2UserMessage as(String alias) {
        return new TS2UserMessage(DSL.name(alias), this);
    }

    @Override
    public TS2UserMessage as(Name alias) {
        return new TS2UserMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TS2UserMessage rename(String name) {
        return new TS2UserMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TS2UserMessage rename(Name name) {
        return new TS2UserMessage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
