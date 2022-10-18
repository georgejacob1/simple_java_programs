import java.util.*;
import java.math.*;

public class String_Palindrome_Manacher{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string: ");
        String s = sc.next();
        String longest_palindrome;

        char[] char_sequences = new char[s.length() * 2 + 3];
        int[] palindrome_lengths = new int[s.length() * 2 + 3];

        int center = 0;
        int right = 0;
        int longest_length = 0;

        char_sequences[0] = '$';
        char_sequences[char_sequences.length - 1] = '@';
        char_sequences[char_sequences.length - 2] = '#';

        for (int i = 0; i < s.length(); i++){
            char_sequences[i * 2 + 1] = '#';
            char_sequences[i * 2 + 2] = s.charAt(i);
        }

        for (int i = 1; i < palindrome_lengths.length - 1; i++){
            int mirror = 2 * center - i;

            if (i < right){
                palindrome_lengths[i] = Math.min(right - i, palindrome_lengths[mirror]);
            }

            while(char_sequences[i+(1+palindrome_lengths[i])] == char_sequences[i-(1+palindrome_lengths[i])]){
                palindrome_lengths[i]++;
            }

            if (i + palindrome_lengths[i] > right){
                center = i;
                right = i + palindrome_lengths[i];
            }
        }

        for (int i = 1; i < palindrome_lengths.length - 1; i++){
            if (palindrome_lengths[i] > longest_length){
                longest_length = palindrome_lengths[i];
                center = i;
            }
        }

        longest_palindrome = s.substring((center - 1 - longest_length) / 2, (center - 1 + longest_length) / 2);
        System.out.println("The longest palindrome is '" + longest_palindrome + "'.");
 
    }
 }
