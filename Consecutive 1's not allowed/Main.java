// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1
import java.util.*;

public class Main {
    static int mod = (int) 1e9 + 7;
    public static long countStrings(int n) {
        long[][] dp = new long[2][n + 1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        for (int j = 2; j < dp[0].length; j++) {
            dp[0][j] = (dp[0][j - 1] + dp[1][j - 1]) % mod;
            dp[1][j] = dp[0][j - 1];
        }
        return ((dp[0][n] + dp[1][n]) % mod);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        countStrings(n);
    }
}