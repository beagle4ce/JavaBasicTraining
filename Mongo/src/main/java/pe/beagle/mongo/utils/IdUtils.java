package pe.beagle.mongo.utils;

import java.util.UUID;

public class IdUtils {

    public static String uuid2() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
