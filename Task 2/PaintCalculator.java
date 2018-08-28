import javax.swing.*;
public class PaintCalculator
{
    public static void main(String [] args)
    {
        String lenghtInput = JOptionPane.showInputDialog(null, "Enter lenght of room: ");
        double roomLength = Integer.parseInt(lenghtInput);
        String widthInput = JOptionPane.showInputDialog(null, "Enter width of room: ");
        double roomWidth = Integer.parseInt(widthInput);
        String heightInput = JOptionPane.showInputDialog(null, "Enter height of room: ");
        double roomHeight = Integer.parseInt(heightInput);
        double price = getArea(roomLength, roomWidth, roomHeight);
        JOptionPane.showMessageDialog(null, "The price to paint the room is $" + price);
    }

    public static double getArea(double length, double width, double height)
    {
        double wallArea = length * height * 2 + width * height * 2;
        double gallonRequired;
        gallonRequired = getRequiredGallons(wallArea);
        JOptionPane.showMessageDialog(null, gallonRequired + " gallons is required");
        int costPerGallon = 32;
        double paintCost = gallonRequired * costPerGallon;
        return paintCost;
    }

    public static double getRequiredGallons(double Area)
    {
        final int spacePerGallon = 350;
        double gallonRequired = Area / spacePerGallon;
        return gallonRequired;
    }

}
