package pe.beagle.jpa.jpacasecadetest.constants;

import lombok.Getter;

/**
 * TIME:2020-03-09 16:52
 * Author:LLH
 * PROJECT:StrategicDecision
 */
public enum Valid {

    INVALID(0),
    VALID(1);

    @Getter
    private int code;

    Valid(int code) {
        this.code = code;
    }
}
