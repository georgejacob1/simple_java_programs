import java.util.Scanner;
public class MergeSort {

	static void merge(int arr[], int l, int m, int r)
	{
        int l1 = m - l + 1;
        int l2 = r - m;

        int L[] = new int[l1];
        int R[] = new int[l2];

        for (int i = 0; i < l1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < l2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < l1 && j < l2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < l1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < l2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int left, int right)
    {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void display(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
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

        sort(arr, 0, len-1);

        System.out.println("\nSorted array");
        display(arr);
        sc.close();
    }
}
