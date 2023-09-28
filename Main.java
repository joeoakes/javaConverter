import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Handle Base number systems
        System.out.println("Enter a hexadecimal number: ");
        String hexNum = scanner.next();
        System.out.println("the Decimal value is " + Converter.convertHex2Decimal(hexNum));
        System.out.println("Enter a decimal number: ");
        int decimalNum = scanner.nextInt();
        System.out.println("the Binary value is " + Converter.convertDecimal2Binary(decimalNum));

        //Handle volume
        System.out.println("Volume Conversion:");
        System.out.println("1. Cubic Meters");
        System.out.println("2. Liters");
        System.out.println("3. Gallons");
        System.out.println("4. Cubic Feet");
        System.out.print("Enter the source volume unit (1/2/3/4): ");
        int sourceUnit = scanner.nextInt();
        System.out.print("Enter the volume value: ");
        double volume = scanner.nextDouble();
        System.out.print("Enter the target volume unit (1/2/3/4): ");
        int targetUnit = scanner.nextInt();
        System.out.println("Converted volume: " + Converter.convertVolume(volume, sourceUnit, targetUnit));

        scanner.close();

    }


}
