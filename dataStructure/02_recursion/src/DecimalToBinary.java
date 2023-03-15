public class DecimalToBinary {

    public static void main(String[] args) {

        DecimalToBinary decimalToBinary = new DecimalToBinary();

        int binary = decimalToBinary.decimalToBinary(42);
        System.out.println(binary);

        binary = decimalToBinary.decimalToBinary(13);
        System.out.println(binary);

        binary = decimalToBinary.decimalToBinary(-2);
        System.out.println(binary);
    }

    public int decimalToBinary(int decimal) {
        if (decimal < 0) return -1;
        if (decimal == 0) return 0;
        return ((decimal % 2) + 10 * (decimalToBinary(decimal / 2)));
    }
}
