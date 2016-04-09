package myIO;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import myIO.beans.CarBean;
import myIO.beans.Engine;

public class IOTests {

    public static void main(String[] args) {
        Engine engine = new Engine("EA211", "Strite", 1498, 4);
        CarBean car = new CarBean("Geely", "承载式车身", 1.3, engine);

        String filePath = "C:\\Users\\Keercat\\Documents\\apache-tomcat\\webapps\\carObj.txt";
        int byteSize = 1024;
        File file = new File(filePath);

        if (file.exists())
            file.delete();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(byteSize);
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                FileOutputStream fos = new FileOutputStream(file)) {
            oos.writeObject(car);
            byte[] byteArray = baos.toByteArray();
            fos.write(byteArray);
            System.out.println("Written was successed!");
        } catch (IOException e) {
            e.printStackTrace();
        }
//============================以下为反序列化================================
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            CarBean carRead = (CarBean) ois.readObject();
            System.out.println(carRead.getCarName());
            System.out.println(carRead.getCarStruct());
            System.out.println(carRead.getCarTon());
            System.out.println(carRead.getEngine().getEngineName());
            System.out.println(carRead.getEngine().getEnginePailie());
            System.out.println(carRead.getEngine().getEnginePailiang());
            System.out.println(carRead.getEngine().getEngineGasGateCount());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
