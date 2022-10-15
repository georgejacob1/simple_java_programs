import java.util.Scanner;

class Palindrome_String {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");

        String inputFromUser = myObj.nextLine(); // Reads the input and stores it in str
        String reverseInput = "";
        int strLength = inputFromUser.length(); // Assigns length of input string to variable

        for (int i = (strLength - 1); i >= 0; --i) { // loop will execute till the end of the string
            reverseInput = reverseInput + inputFromUser.charAt(i);
        }

        if (inputFromUser.toLowerCase().equals(reverseInput.toLowerCase())) { // checks if both reversed string and
                                                                              // orignal string is equal
            System.out.println(inputFromUser + " is a Palindrome String."); // print if its a palindrome
        } else {
            System.out.println(inputFromUser + " is not a Palindrome String."); // print if it is not palindrome
        }
    }
}