package carShowroom;

import java.lang.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        takeInput();

    }


    static void takeInput(){
        while(true){
            for(int i=0;i<100;i++)System.out.print('#');
            System.out.print('\n');
        System.out.println("WELCOM TO OUR VEHICLE MANAGEMENT SYSTEM \n" +
                "HOW CAN WE HELP YOU??\n"+
                "CHOOSE A OPTION FOR CONTINUING WITH US............\n"+
                "1 FOR ADDING A VEHICLE TO THE SHOWROOMM\n"+
                "2 FOR REMOVING A VEHICLE FROM THE SHOWROOM\n"+
                "3 FOR SEEING THE CURRENT VEHICLES\n"+
                "4 FOR SEEING THE CURRENT VEHICLES WITH EXPECTED VISITOR COUNT\n"+
                "5 FOR EXIT");

        Scanner input = new Scanner(System.in);
        int option=input.nextInt();
        if(option==5)break;
        switch (option) {
            case 1: { /* FOR ADDING VEHICLE TO THE SYSTEM */

                System.out.println("WHICH TYPES OF VEHICLE YOU WANTED TO ADD??\n" +
                        "CHOOSE AN OPTION FROM THE BELOW\n" +
                        "1 FOR NORMAL VEHICLE \n" +
                        "2 FOR SPORTS VEHICLE\n" +
                        "3 FOR HEAVY VEHICLE");
                int typeOfVehicle = input.nextInt();
                input.nextLine();
                System.out.println("PLEASE ENTER A MODEL NUMBER OF THE VEHICLE:");
                String modelNumber = input.nextLine();
                System.out.println(modelNumber);
                int engineType;
                engineType = typeOfVehicle;
                if (typeOfVehicle == 1) {
                    System.out.println("PLEASE ENTER TYPE OF ENGINE\n" +
                            "CHOOSE AN OPTION FROM BELOW\n" +
                            "1 FOR GAS\n" +
                            "2 FOR OIL\n" +
                            "3 FOR DISEL");
                    engineType = input.nextInt();
                    input.nextLine();
                }
                System.out.println("PLEASE ENTER A VALUE OF ENGINE POWER(A INTEGER VALUE)");
                int enginePower = input.nextInt();
                input.nextLine();
                System.out.println("PLEASE ENTER THE TIRE SIZE");
                String tireSize = input.nextLine();
                int weight = -1, turbo = -1;
                if (typeOfVehicle == 3) {
                    System.out.println("PLEASE ENTER THE WEIGHT OF THE VEHICLE");
                    weight = input.nextInt();
                }
                if (typeOfVehicle == 2) {
                    System.out.println("IF TURBO PLEASE ENTER 1 OTHERWISE 0");
                    turbo = input.nextInt();
                }

                Showroom.addVehicle(typeOfVehicle, modelNumber, engineType, enginePower, tireSize, weight, turbo);

                continue;
            }
            case 2:{ /* FOR REMOVING A VEHICLE FROM THE SHOWROOM */
                //Showroom.showVehicles(0);
                System.out.println("WHAT TYPE OF VEHICLE YOU WANT TO REMOVE\n"+
                        " 1 FOR NORMAL VEHICLE\n"+
                        " 2 FOR SPORTS VEHICLE\n"+
                        "3 FOR HEAVY VEHICLE");
                int type=input.nextInt();
                Showroom.showVehicles(type);
                System.out.println("PLEASE ENTER AN INDEX NUMBER FROM THE ABOVE WHICH ONE YOU WANT TO REMOVE \n"+
                        "OR ENTER 0 FOR DO NOTHING ");
                int index=input.nextInt();
                if(index==0?false:true


                )Showroom.removeVehicle(type,index);
                continue;
            }
            case 3:{  /* FOR SEEING THE CURRENT VEHICLES */
                Showroom.showVehicles(0);
                continue;
            }
            case 4:{  /* FOR SEEING THE CURRENT VEHICLES WITH EXPECTED VISITOR COUNT */
                Showroom.showVehiclesWithExpectedVisitorCount();
                continue;
            }
            default: {

            }
        }
        }
    }

}
