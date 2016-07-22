import java.io.IOException;
import java.util.Scanner;

/**
 * Created by david bennight on 7/21/2016.
 */
public class Budget_Project {




    public static void main(String args[]) throws IOException {

        double stuff;
        double stuff2;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        stuff = in.nextDouble();
        System.out.print("Enter a another number: ");
        stuff2  = in.nextDouble();

        if (SalaryChecker(stuff, stuff2)) {
            System.out.println("its true an works");


        }


    }

    // come up with better name for salary checker
    public static boolean SalaryChecker(double salary, double bills) {

        if (salary >= bills) {
            return true;
        } else {
            return false;

        }


    }


}



