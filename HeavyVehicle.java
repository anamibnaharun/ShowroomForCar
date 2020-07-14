package carShowroom;
public class HeavyVehicle extends Vehicle{

    private int weight;
    HeavyVehicle(){
        super.setEngineType("Diesel");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}