package com.pluralsight;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Establish Main Values, from user
        String pickupDate;
        short numberOfDays;
        boolean needsTolltag;
        boolean needsGPS;
        boolean needsRoadsideAssistance;
        short age;


        //Calculate Unknown values
        double basicCarRentalFee =0;
        double optionsTotalFee =0;
        double underageSurcharge =0;
        double totalCost=0;



        //Display the results
        System.out.printf("Basic Car Rental Fee:%.2f/n", basicCarRentalFee);
        System.out.printf("Options Fee:      %.2f/n", optionsTotalFee);
        System.out.printf("Underage surcharge Fee:%.2f/n", underageSurcharge);
        System.out.println(" ---------------------------");
        System.out.printf("TOTAL:                 %2F/n", totalCost);

        System.out.println(pickupDate);
    }




public static String PromptForString(String prompt){
   System.out.print(prompt);
   return scanner.nextLine();

}
public static boolean PromptForYesNo( String prompt){}
System.out.print(prompt + " ( Y for Yes, N for No ) ?");
    String userINPUT = scanner.nextLine();
}