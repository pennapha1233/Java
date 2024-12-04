public class Example02_05 {
    public static void main(String[] args) {
        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;
        char varChar;

        // Initial value to vaireble 
        varByte = (byte) 256; // #1
        varShort = (short) 32800; // #2
        varInt = 200000000; // #3
        varLong = 500000000000L; // #4
        varFloat = 120e10F + 234e10F; // #5
        varDouble = 120e10 + 234e10; // #6
        varChar = 'A'; // #7

        System.out.println("Value byte : " + varByte);
        System.out.println("Value short : " + varShort);
        System.out.println("Value int : " + varInt);
        System.out.println("Value long : " + varLong);
        System.out.println("Value float : " + varFloat);
        System.out.println("Value double : " + varDouble);
        System.out.print("Value char : " + varChar);
        System.out.println(", Value ascii : " + (byte) varChar);
        System.out.print("value ascii : " + 68);
        System.out.println(", value char : " + (char) 68);
    }
    
}
