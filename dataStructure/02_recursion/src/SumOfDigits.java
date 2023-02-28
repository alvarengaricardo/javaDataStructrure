
public class SumOfDigits {

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();

        var result = sumOfDigits.sumDigits(42);
        System.out.println(result);

        result = sumOfDigits.sumDigits(-42);
        System.out.println(result);

    }

    public int sumDigits(int n){
        if (n == 0 || n < 0) return 0;
        return n%10 + sumDigits(n/10);
    }
}


