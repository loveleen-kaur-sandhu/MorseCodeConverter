
/**
 * 
 */
import java.util.Scanner;

public class MorseCodeConverter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // user response if they want to continue converting Strings to
        // MorseCode is stored in ans
        String ans = "y";
        // user enters the String which they want to convert
        // that String is stored in input
        String input = " ";
        // till the user responds yes
        // user is prompted to enter a String using Scanner object kb
        // Using the String given by the user , a new Morse
        // object is created and then it is printed out
        // user is prompted if they want to convert another String
        while (ans.charAt(0) == 'y' || ans.charAt(0) == 'Y') {
            System.out.println("Enter a String and I will convert it to Morse code");
            input = kb.nextLine();
            Morse input1 = new Morse(input);
            System.out.println(input1);
            System.out.println("Do you want to convert another string into MORSE CODE");
            ans = kb.nextLine();

        }
        System.out.println("Bye Bye...");

    }
}
