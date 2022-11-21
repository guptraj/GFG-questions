// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/count-the-number-of-ways-to-tile-the-floor-of-size-n-x-m-using-1-x-m-size-tiles0509/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

import java.util.*;

public class Main {
    public static long mod = (long) 1e9 + 7;

    public int countWays(int n, int m) {
        long[] dp = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[0] = 1;
                continue;
            }
            long vCall = dp[i - 1];
            long hCall = 0;
            if (i - m >= 0) {
                hCall = dp[i - m];
            }
            dp[i] = (vCall + hCall) % mod;
        }
        return (int) dp[n];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(numberOfWays(n));
    }
}