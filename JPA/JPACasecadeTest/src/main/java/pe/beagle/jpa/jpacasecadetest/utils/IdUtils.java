package pe.beagle.jpa.jpacasecadetest.utils;

import org.springframework.util.AlternativeJdkIdGenerator;

/**
 * TIME:2020-08-20 11:27
 * Author:LLH
 * PROJECT:StrategicDecision
 */
public class IdUtils {
    private static AlternativeJdkIdGenerator alternativeJdkIdGenerator = new AlternativeJdkIdGenerator();

    public static String generatedID() {
        return alternativeJdkIdGenerator.generateId().toString().replaceAll("-", "");
    }
}
