import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();
        // the string input has been converted to a character array

        //loop through the array, one by one, from end to start
        for(int i=letters.length-1; i>=0; i--) {
            System.out.print(letters[i]); //print characters
        }
        System.out.print("\n");
        System.out.println("See what I did there?");
    }
}
