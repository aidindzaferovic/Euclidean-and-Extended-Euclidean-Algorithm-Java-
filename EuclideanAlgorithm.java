public class EuclideanAlgorithm {
public static int gcd(int a, int b) {
     if (b == 0) {
     return a;
    }
     return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
    System.out.println("The GCD of " + N + " and " + a + " is: " + gcd(N, a));
}
}
