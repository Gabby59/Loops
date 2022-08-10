import java.util.Scanner;

public class TimesTables {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like? ");
        int timesTable = reader.nextInt(); //store user's input in timesTable variable
        System.out.println("In a giffy!");

        //loop so that we multiply the user's input with each integer number , from 1 to 12
        for (int i=1; i <= 12; i=i+1)
        {
            System.out.println( i * timesTable); // display the output of each multiplication
        }

        System.out.print("Easy peasy :)");


    }
}
