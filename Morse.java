/**
 * 
 */
public class Morse {
    // NUM_CHARS field stores no of characters allowed
    public int NUM_CHARS = 40;
    // original stores the original String
    private String original;
    // mcode stores the String converted to morseCode
    private String mcode;
    // regular char[] array stores values for characters
    private char[] regular = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z', 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    // morse String[] array stores value for regular array's corresponding
    // morse values
    private String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---",
            "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

    /**
     * Constructor Morse takes String as an argument
     * converts it into an array called array of Strings by splitiing the spaces
     * between words
     * outer for loop converts every element of this array
     * into an another char Array named input1 and then
     * every element for that char Array is converted
     * into morse code using the method
     * toMorse() by looping through each element
     * using inner for loop and morse code is added into an empty
     * String s which was initialised as ""
     * and then s is assigned to field mcode
     * 
     * @param input
     */
    public Morse(String input) {
        String s = "";

        String[] array = input.split(" ");

        for (int j = 0; j < array.length; j++) {

            char[] input1 = array[j].toCharArray();
            if (input1.length <= this.NUM_CHARS) {

                for (int i = 0; i < input1.length; i++) {
                    s += toMorse(input1[i]) + "\n";
                }
                s += "\n";
            } else {
                System.out.println("Input length must be upto 40 characters.");
            }
        }
        mcode = s;

    }

    /**
     * toMorse takes in characters
     * and returns the corresponding MorseCode
     * 
     * @param h is a character
     * @return output as morse code for the character entered
     */

    public String toMorse(char h) {
        char d = Character.toUpperCase(h);
        boolean found = false;
        int i = 0;
        int index = 0;
        String output = " ";
        while (!found && i < regular.length) {

            if (d == regular[i]) {
                found = true;
                index = i;
            }
            i++;

        }

        output = morse[index];
        return output;

    }

    /**
     * getMorseCode returns mcode
     * 
     * @return mcode as String
     */

    public String getMorseCode() {
        return mcode;
    }

    /**
     * getOriginal returns the original
     * String entered by the user
     * 
     * @return original
     */

    public String getOriginal() {
        return original;
    }

    /**
     * toString() returns mcode
     * whenever an object of Morse class is printed out
     */
    public String toString() {
        return mcode;
    }
}