package myIO.beans;

import java.io.Serializable;

public class Engine implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String engineName;
    private String enginePailie;
    private int enginePailiang;
    private int engineGasGateCount;

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEnginePailie() {
        return enginePailie;
    }

    public void setEnginePailie(String enginePailie) {
        this.enginePailie = enginePailie;
    }

    public int getEnginePailiang() {
        return enginePailiang;
    }

    public void setEnginePailiang(int enginePailiang) {
        this.enginePailiang = enginePailiang;
    }

    public int getEngineGasGateCount() {
        return engineGasGateCount;
    }

    public void setEngineGasGateCount(int engineGasGateCount) {
        this.engineGasGateCount = engineGasGateCount;
    }

    public Engine(
            String engineName,
            String enginePailie,
            int enginePailiang,
            int engineGasGateCount) {
        super();
        this.engineName = engineName;
        this.enginePailie = enginePailie;
        this.enginePailiang = enginePailiang;
        this.engineGasGateCount = engineGasGateCount;
    }

    public Engine() {
        super();
    }

}
