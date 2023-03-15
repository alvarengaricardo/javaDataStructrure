public class Power {
    public static void main(String[] args) {

        Power power = new Power();
        var result = power.power(2, 5);
        System.out.println(result);

        result = power.power(2, -2);
        System.out.println(result);
    }

    public static int power(int base, int exp) {

        if (exp < 0) return -1;
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}
