public class Main {
    public static void main(String[] args) {
        //8 primitive dataTypes:

        boolean aBool = true; // 1 bit

        byte aByte = 100; // 8 bits
        short aShort = 93; // 16 bits
        int aValue = 10; // 32 bits
        long aLong = 8304;// 64 bits

        float aFloat = 5.233f; // 32 bits
        double aDouble = 3.4553; // 64 bits

        char aChar = 'b'; // 16 bits

        String text = "Hi";
        String blank = " ";
        String moreText = "There";
        String total = text + blank + moreText;
        System.out.println(text + blank + moreText);
        System.out.println(total);
        System.out.println(total.length());
    }
}