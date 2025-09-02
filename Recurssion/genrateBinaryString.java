public class genrateBinaryString {
    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int num = 5;
        String binary = toBinary(num);


        if (binary.equals("")) {
            binary = "0";
        }

        System.out.println("Binary of " + num + " is: " + binary);
    }
}
