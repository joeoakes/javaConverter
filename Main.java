import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Decimal value is " + Converter.convertHex2Decimal("ff"));
        System.out.println("Decimal value is " + Converter.convertDecimal2Binary(42));

    }



        public static double convertVolume(double volume) {
            Scanner scanner = new Scanner(System.in);
            int targetUnit = scanner.nextInt();
            switch (targetUnit) {
                case 1: // Cubic Meters
                    return volume / 264.172;
                case 2: // Liters
                    return volume * 3.78541;
                case 3: // Gallons
                    return volume;
                case 4: // Cubic Feet
                    return volume * 0.133681;
            }
            return 0.0;
        }
}
