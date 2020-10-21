package com.diamondfsd.jooq.learn;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class CustomGeneratorStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        String result = super.getJavaClassName(definition, mode);
        switch (mode) {
            case POJO:
                result += "Pojo";
                break;
            case RECORD:
                result += "Record";
                break;
            case DAO:
                result += "DAO";
                break;
            case ENUM:
                result += "Enum";
                break;
            case DEFAULT:
//                result += "Table";
                break;
            default:
                break;
        }
        return result;
    }
}
