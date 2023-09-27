public class Converter {

    public static int convertHex2Decimal(String hexNum){
        return Integer.parseInt(hexNum, 16);
    }

    public static String convertDecimal2Binary(int decNum){
        return Integer.toBinaryString(decNum);
    }

}
