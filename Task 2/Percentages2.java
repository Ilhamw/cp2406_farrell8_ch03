import javax.swing.*;
public class Percentages2
{
    public static void main(String [] args)
    {
        double num1;
        double num2;
        String numInput1 = JOptionPane.showInputDialog(null, "Enter first number: ");
        num1 = Integer.parseInt(numInput1);
        String numInput2 = JOptionPane.showInputDialog(null, "Enter first number: ");
        num2 = Integer.parseInt(numInput2);
        computePercent(num1, num2);
        computePercent(num2, num1);

    }

    public static void computePercent(double n, double m)
    {
        double percent = (n/m * 100);
        JOptionPane.showMessageDialog(null, n + " is " + percent + " percent of " + m);
    }

}
