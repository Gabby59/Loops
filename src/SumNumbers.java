import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int sumTotal =0;
        int i=1;

        Scanner reader = new Scanner(System.in);
        System.out.print("Input a positive integer number to sum to: ");
        int sumTo = reader.nextInt();
        System.out.println("In a giffy!");

        String input=String.valueOf(sumTo); // input will check whether the user has entered a number
        while(i<=sumTo && input!="" ){     //while count is smaller or equal to the input
            sumTotal= sumTotal + i ;  //calculate total sum by adding each next number
            i++;  //increase count
        }
        System.out.println("The total is: " + sumTotal);


    }
}
