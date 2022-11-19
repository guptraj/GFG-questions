import java.util.*;

public class Main {
    static int mod = (int) 1e9 + 7;
    public static int TotalWays(int n) {
        long oldz = 1;
        long oldo = 1;
        for (int i = 2; i <= n; i++) {
            long newz = (oldz + oldo) % mod;
            long newo = oldz;
            oldz = newz;
            oldo = newo;
        }
        long total = (((oldz + oldo) % mod) * ((oldz + oldo) % mod)) % mod;
        return (int) total;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        TotalWays(n);
    }
}