import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Find min number
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            // Swap number
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println(" " + Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        Main ss = new Main();
        int a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter length of array: ");
                a = Integer.parseInt(sc.next());
                if (a < 0) {
                    System.out.println("Input must > 0");
                } else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input must be a number");
            }
        }

        int[] arr;
        arr = new int[a];

        for (int i = 0; i < a; i++) {
            while (true) {
                try {
                    System.out.println("Enter element " + (i + 1) + ": ");
                    arr[i] = Integer.parseInt(sc.next());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Input must be number ");
                }
            }
        }

        ss.sort(arr);

        System.out.println("Arrays: " + Arrays.toString(arr));

    }
}
