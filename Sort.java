import java.util.*;
public class CountSort {

    static void countSort(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static void display(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    // Driver code
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter array elements:");
        for(int i = 0; i<len; i++)
        	arr[i] = sc.nextInt();

        System.out.println("Given Array");
        display(arr);

        System.out.println("\nSorted array");
        countSort(arr);
        display(arr);
        sc.close();
    }
}
