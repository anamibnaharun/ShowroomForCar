package carShowroom;
public class Vehicle{
    private String modelNumber;
    private String engineType;
    private int enginePower;
    private String tireSize;
    Vehicle(){

    }
    Vehicle(String modelNumber, String engineType, int enginePower, String tireSize){
        this.modelNumber=modelNumber;
        this.engineType=engineType;
        this.enginePower=enginePower;
        this.tireSize=tireSize;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

}
