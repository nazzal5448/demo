public class BitManipulation {
    public static void main(String args[]) {
        int num = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        int operation = 0;

        if (operation == 1) {
            int number = bitMask | num;
            System.out.println(number);
        } else if (operation == 0) {
            int newBitMask = ~(bitMask);
            int number = newBitMask & num;
            System.out.println(number);
        }

    }
}
