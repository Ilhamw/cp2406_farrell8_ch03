import javax.swing.*;
public class MetricConversion
{
    public static void main(String [] args)
    {
        int number;
        String userInput = JOptionPane.showInputDialog(null, "Enter an integer: ");
        number = Integer.parseInt(userInput);
        convertToCentimeters(number);
        convertToLitres(number);
    }

    public static void convertToCentimeters(int inches)
    {
        final double cmConvert = 2.54;
        double centimetres = inches * cmConvert;
        JOptionPane.showMessageDialog(null, inches + " inches is " + centimetres + " centimetres");
    }

    public static void convertToLitres(int usGallons)
    {
        final double lConvert = 3.7854;
        double litres = usGallons * lConvert;
        JOptionPane.showMessageDialog(null, usGallons + " U.S.Gallons is " + litres + " litres");
    }
}
