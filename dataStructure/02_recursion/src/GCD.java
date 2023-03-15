
// Greatest Common Divisor using Euclidean Algorithm
public class GCD {
    public static void main(String[] args) {

        GCD gcd = new GCD();
        int result = gcd.gcd(21, 5);
        System.out.println(result);

        result = gcd.gcd(20, 4);
        System.out.println(result);

        result = gcd.gcd(36, 9);
        System.out.println(result);

        result = gcd.gcd(21, -5);
        System.out.println(result);
    }

    public int gcd(int a, int b) {
        if(a<0 || b<0) return -1;
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}