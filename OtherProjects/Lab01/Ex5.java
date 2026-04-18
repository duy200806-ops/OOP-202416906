import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int sum = 0;
        for (int num : arr) sum += num;
        double avg = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
