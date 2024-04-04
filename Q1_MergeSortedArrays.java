
import java.util.Arrays;
import java.util.Scanner;

public class Q1_MergeSortedArrays {
    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        int i = k + 1;
        int j = 0;
        int idx = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[idx] = X[i];
                i++;
            } else {
                X[idx] = Y[j];
                j++;
            }
            idx++;
        }
        while (j < n) {
            X[idx] = Y[j];
            idx++;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("size of array X: ");
        int m = scanner.nextInt();
        int[] X = new int[m];

        System.out.println("elements of array X:");
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.print("size of array Y: ");
        int n = scanner.nextInt();
        int[] Y = new int[n];

        System.out.println("elements of array Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

        mergeArrays(X, Y, m, n);

        System.out.println("Merged Array X[]:");
        System.out.println(Arrays.toString(X));
    }
}
