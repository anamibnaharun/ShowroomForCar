package carShowroom;
public class SportsVehicle extends Vehicle{

    private boolean turbo;

    SportsVehicle(){
        super.setEngineType("Oil");
    }

    public boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

}