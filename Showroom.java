package carShowroom;

import java.util.*;
import java.lang.*;

interface WorkOfShowroom{
    public static   void addVehicle(int typeOfVehicle, String modelNumber, int typeOfEngine, int enginePower,String tireSize, int weight, int turbo){};
    public static   void removeVehicle(int type, int index){};
    public static   void showVehicles(int type){};
    public static   void showVehiclesWithExpectedVisitorCount(){};
}
public class Showroom implements WorkOfShowroom{
    private static ArrayList<NormalVehicle>listForNormalVehicle=new ArrayList<>();
    private static ArrayList<SportsVehicle>listForSportsVehicle=new ArrayList<>();
    private static ArrayList<HeavyVehicle>listForHeavyVehicle=new ArrayList<>();
    private static HashMap<Integer,String> engineTypes=new HashMap<>();
    private static int expectedVisitorCount=30;
    static {
        engineTypes.put(1,"normalVehicle");
        engineTypes.put(2,"sportsVehicle");
        engineTypes.put(3,"heavyVehicle");
    }

    public static   void addVehicle(int typeOfVehicle, String modelNumber, int typeOfEngine, int enginePower,String tireSize, int weight, int turbo){
        if(typeOfVehicle==1)
        {
            NormalVehicle obj=new NormalVehicle();
            obj.setModelNumber(modelNumber);
            obj.setEngineType(engineTypes.get(typeOfEngine));
            obj.setEnginePower(enginePower);
            obj.setTireSize(tireSize);
            listForNormalVehicle.add(obj);
            expectedVisitorCount +=20;
            System.out.println(obj.getModelNumber()+' '+ obj.getEngineType()+' '+obj.getEnginePower()+' '+obj.getTireSize());
        }
        else if(typeOfVehicle==2)
        {
            SportsVehicle obj=new SportsVehicle();
            obj.setModelNumber(modelNumber);
            obj.setEnginePower(enginePower);
            obj.setTireSize(tireSize);
            obj.setTurbo(turbo==1?true:false);
            listForSportsVehicle.add(obj);
            expectedVisitorCount +=20;
            System.out.println(obj.getModelNumber()+' '+ obj.getEngineType()+' '+obj.getEnginePower()+' '+obj.getTireSize()+' '+obj.getTurbo());
        }
        else if(typeOfVehicle==3){
            HeavyVehicle obj=new HeavyVehicle();
            obj.setModelNumber(modelNumber);
            obj.setEnginePower(enginePower);
            obj.setTireSize(tireSize);
            obj.setWeight(weight);
            listForHeavyVehicle.add(obj);
            expectedVisitorCount +=20;
            System.out.println(obj.getModelNumber()+' '+ obj.getEngineType()+' '+obj.getEnginePower()+' '+obj.getTireSize()+' '+obj.getWeight());
        }
        else{
            System.out.println("THIS TYPE OF VEHICLE DON'T EXIST IN THE SHOWROOM");
        }
    }

    public static   void removeVehicle(int type, int index){
        if(type==1)
        {
            listForNormalVehicle.remove(index-1);
        }
        if(type==2)
        {
            listForSportsVehicle.remove(index-1);
        }
        if(type==3)
        {
            listForHeavyVehicle.remove(index-1);
        }
    }

    public static   void showVehicles(int type){
        if(type==0 | type==1) showNormalVehicle();
        if(type==0 | type==2) showSportsVehicle();
        if(type==0 | type==3) showHeavyVehicle();

    }
    public static   void showVehiclesWithExpectedVisitorCount(){
        String text="*  Expected Visitor Count = " + expectedVisitorCount+"  *";
        formattedPrint(text);
        showVehicles(0);



    }
    private static void showNormalVehicle(){
        System.out.println("\nNORMAL VEHICLES:");
        if(listForNormalVehicle.size()==0)System.out.println(" TTHERE IS NO NORMAL VEHICLE");
        int count=1;
        for (NormalVehicle vehicle:listForNormalVehicle) {
            String text= "*  "+count +". Model Number = "+vehicle.getModelNumber()+" | "+"Engine Type = "+ vehicle.getEngineType()+" | "+"Engine Power = "+vehicle.getEnginePower()+" | "+"Tire Size = "+vehicle.getTireSize()+" *";
            formattedPrint(text);
            count +=1;
        }
    }
    private static void showSportsVehicle(){
        System.out.println("\nSPORTS VEHICLES:");
        if(listForSportsVehicle.size()==0)System.out.println(" TTHERE IS NO SPORTS VEHICLE");
        int count=1;
        for (SportsVehicle vehicle:listForSportsVehicle) {
            String text= "* "+count +". Model Number = "+vehicle.getModelNumber()+" | "+"Engine Type = "+ vehicle.getEngineType()+" | "+"Engine Power = "+vehicle.getEnginePower()+" | "+"Tire Size = "+vehicle.getTireSize()+" | "+"Turbo = "+vehicle.getTurbo()+" *";
            formattedPrint(text);
            count +=1;
            // System.out.println(vehicle.getModelNumber()+' '+ vehicle.getEngineType()+' '+vehicle.getEnginePower()+' '+vehicle.getTireSize()+' '+vehicle.getTurbo());
        }
    }
    private static void showHeavyVehicle(){
        System.out.println("\nHEAVY VEHICLES:");
        if(listForHeavyVehicle.size()==0)System.out.println(" TTHERE IS NO HEAVY VEHICLE\n");
        int count=1;
        for (HeavyVehicle vehicle:listForHeavyVehicle) {
            String text= "* "+count +". Model Number = "+vehicle.getModelNumber()+" | "+"Engine Type = "+ vehicle.getEngineType()+" | "+"Engine Power = "+vehicle.getEnginePower()+" | "+"Tire Size = "+vehicle.getTireSize()+" | "+"Weight = "+vehicle.getWeight()+" *";
            Showroom.formattedPrint(text);
            count +=1;
            //System.out.println(vehicle.getModelNumber()+' '+ vehicle.getEngineType()+' '+vehicle.getEnginePower()+' '+vehicle.getTireSize()+' '+vehicle.getWeight());
        }
    }
    private static void formattedPrint(String text){
        for(int i=0;i<text.length();i++)System.out.print('*');
        System.out.print('\n');
        System.out.println(text);
        //System.out.println(count +". Model Number = "+vehicle.getModelNumber()+" | "+"Engine Type = "+ vehicle.getEngineType()+" | "+"Engine Power = "+vehicle.getEnginePower()+" | "+"Tire Size = "+vehicle.getTireSize());
        for(int i=0;i<text.length();i++)System.out.print('*');
        System.out.print('\n');
    }
}