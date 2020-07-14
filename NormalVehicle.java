package carShowroom;
public class NormalVehicle extends Vehicle{

    NormalVehicle(){

    }
    NormalVehicle(String modelNumber, String engineType, int enginePower, String tireSize){
        super( modelNumber,  engineType,  enginePower,  tireSize);
    }
}