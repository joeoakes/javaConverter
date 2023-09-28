public class Converter {

    public static int convertHex2Decimal(String hexNum){
        return Integer.parseInt(hexNum, 16);
    }

    public static String convertDecimal2Binary(int decNum){
        return Integer.toBinaryString(decNum);
    }

    //Liters: Cubic Meters:volume / 1000; Gallons volume * 0.264172; Cubic Feet volume * 0.0353147;
    //Gallons: Cubic Meters:volume / 264.172; Liters volume * 3.78541; Cubic Feet volume * 0.133681;
    //Cubic Feet: Cubic Meters:volume / 35.3147; Liters volume * 28.3168; Gallons volume * 7.48052;
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

    //Centimeters: Meters length / 100; Feet length * 0.0328084; Inches length * 0.393701;
    //Feet: Meters length *  0.3048; Centimeters length * 30.48; Inches length * 12;
    //Inches: Meters llength * 0.0254; Centimeters length * 2.54; Feet length * 0.0833333;
    public static double convertLength(double length, int sourceUnit, int targetUnit) {
        switch (sourceUnit) {
            case 1: // Meters
                switch (targetUnit) {
                    case 1: // Meters
                        return length;
                    case 2: // Centimeters
                        return length * 100;
                    case 3: // Feet
                        return length * 3.28084;
                    case 4: // Inches
                        return length * 39.3701;
                }
                break;
        }
        return 0.0; // Default if units are not recognized
    }

    public static double getExchangeRate(String sourceCurrency, String targetCurrency) {
        // In a real application, fetch the exchange rate from an API or database
        // Here, we use a hardcoded exchange rate (for demonstration purposes)
        // You should replace this with a reliable source of exchange rates
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85; // 1 USD = 0.85 EUR
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            return 0.73; // 1 USD = 0.73 GBP
        } else {
            return -1.0; // Invalid currency codes
        }
    }
    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

}
