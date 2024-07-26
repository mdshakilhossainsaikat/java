package com.valluk.again;
import java.util.Scanner;
public class Permutation2 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the permutation
            int[] p = new int[n + 1];   // Permutation array, using 1-based index

            for (int i = 1; i <= n; i++) {
                p[i] = scanner.nextInt();
            }

            int count = 0;

            // Loop over all pairs (i, j) where 1 <= i < j <= n
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if ((p[i] * p[j]) % (i * j) == 0) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
    

