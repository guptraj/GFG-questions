import java.util.Scanner;

// QUESTION LINK
// https://practice.geeksforgeeks.org/problems/count-subsequences-of-type-ai-bj-ck4425/1
public class Main {
    static long mod = (long) 1e9 + 7;
    public int fun(String s) {
        long a = 0;
        long ab = 0;
        long abc = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a = (2 * a + 1) % mod;
            } else if (s.charAt(i) == 'b') {
                ab = (2 * (ab) + a) % mod;
            } else if (s.charAt(i) == 'c') {
                abc = (2 * (abc) + ab) % mod;
            }
        }
        return (int) (abc % mod);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(fun(str)); 
    }
}