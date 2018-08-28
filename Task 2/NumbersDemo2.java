import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.lang.Math;
public class NumbersDemo2
{
    public static void main(String [] args) {
        int a;
        int b;
        String numInputA = JOptionPane.showInputDialog(null, "Enter first number: ");
        a = Integer.parseInt(numInputA);
        String numInputB = JOptionPane.showInputDialog(null, "Enter second number: ");
        b = Integer.parseInt(numInputB);
        displayTwiceNumber(a);
        displayTwiceNumber(b);
        displayPlusFive(a);
        displayPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }

    public static void displayTwiceNumber(int n)
    {
        JOptionPane.showMessageDialog(null, "Twice of the number " + n + " is: " + n * 2);
    }
    public static void displayPlusFive(int n)
    {
        JOptionPane.showMessageDialog(null, "The number " + n + "  plus 5 equals to: " + (n + 5));
    }
    public static void displayNumberSquared(int n)
    {
        int i = (int) Math.pow(n, 2);
        JOptionPane.showMessageDialog(null, "The square of the number " + n + "  is: " + i);
    }
}
