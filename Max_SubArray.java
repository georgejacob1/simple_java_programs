import java.util.*;

public class Max_SubArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in the array?: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int max_sum = array[0];
        int current_max_sum = array[0];
        
        for (int i = 1; i < array.length; i++){
            current_max_sum = Math.max(current_max_sum + array[i], array[i]);
            max_sum = Math.max(max_sum, current_max_sum);
        }

        System.out.println("Largest sum is " + max_sum);

        sc.close();
    }
}
