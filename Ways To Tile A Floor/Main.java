import java.util.*;

public class Main {
    public static long mod = (long) 1e9 + 7;

    public static Long numberOfWays(int n) {
        long[] dp = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[0] = 1;
                continue;
            }
            long vCall = dp[i - 1];
            long hCall = 0;
            if (i - 2 >= 0) {
                hCall = dp[i - 2];
            }
            dp[i] = (vCall + hCall) % mod;
        }
        return dp[n];
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(numberOfWays(n));
    }
}