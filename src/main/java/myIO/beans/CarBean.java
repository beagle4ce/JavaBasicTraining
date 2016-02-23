package myIO.beans;

import java.io.Serializable;

public class CarBean implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String carName;
    private String carStruct;
    private double carTon;
    private Engine engine;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarStruct() {
        return carStruct;
    }

    public void setCarStruct(String carStruct) {
        this.carStruct = carStruct;
    }

    public double getCarTon() {
        return carTon;
    }

    public void setCarTon(double carTon) {
        this.carTon = carTon;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarBean(String carName, String carStruct, double carTon, Engine engine) {
        super();
        this.carName = carName;
        this.carStruct = carStruct;
        this.carTon = carTon;
        this.engine = engine;
    }

    public CarBean() {
        super();
    }

}
