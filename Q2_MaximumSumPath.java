import java.util.*;

public class Q2_MaximumSumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = 0, j = 0;
        int sumX = 0, sumY = 0, result = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        while (i < m) {
            sumX += X[i++];
        }
        while (j < n) {
            sumY += Y[j++];
        }
        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of the first array:");
        int m = scanner.nextInt();
        int[] X = new int[m];
        System.out.println("elements of the first array in sorted order:");
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("size of the second array:");
        int n = scanner.nextInt();
        int[] Y = new int[n];
        System.out.println("elements of the second array in sorted order:");
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

        int maxSum = maxSumPath(X, Y);
        System.out.println("The maximum sum path is: " + maxSum);
    }
}