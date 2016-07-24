import java.io.IOException;
import java.util.Scanner;

/**
 * Created by david bennight on 7/21/2016.
 */
public class Budget_Project {


    public static void main(String args[]) {

        double stuff;
        double stuff2;
        Budget budget;
        int menuNumber;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println();
        System.out.println();
        System.out.println("Track bills: 1");
        System.out.println("Check salary in question: 2");
        System.out.println("Get monthly bill total: 3");
        System.out.println("Get yearly bill total: 4");
        System.out.print("Enter number: ");
        menuNumber = in.nextInt();
        System.out.println(menuNumber);

        switch (menuNumber){

            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:

                System.out.println("try something else");

        }







    }





}



