package JAVAandDSAKHAPRA;

public class _36b_Clearbit {
    public static void main(String[] args) {
        int n =5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask =~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
