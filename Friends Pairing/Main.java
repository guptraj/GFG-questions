// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
import java.util.*;
public class Main {
    static long mod = (long) 1e9 + 7;

    public long friendsPairing(int n, long[] dp) {
        if (n == 0) {
            return dp[n] = 0;
        }
        if (n == 1) {
            return dp[n] = 1;
        }
        if (n == 2) {
            return dp[n] = 2;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        long a = friendsPairing(n - 1, dp);
        long b = ((n - 1) * friendsPairing(n - 2, dp) % mod);
        return dp[n] = (a + b) % mod;
    }

    public long countFriendsPairings(int n) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        return (friendsPairing(n, dp)) % mod;
    }

}