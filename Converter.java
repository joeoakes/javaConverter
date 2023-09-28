public class Converter {

    public static int convertHex2Decimal(String hexNum){
        return Integer.parseInt(hexNum, 16);
    }

    public static String convertDecimal2Binary(int decNum){
        return Integer.toBinaryString(decNum);
    }

    public static double convertVolume(double volume, int sourceUnit, int targetUnit) {
        switch (sourceUnit) {
            case 1: // Cubic Meters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume * 1000;
                    case 3: // Gallons
                        return volume * 264.172;
                    case 4: // Cubic Feet
                        return volume * 35.3147;
                }
                break;
        }
        return 0.0;
    }

}
