import java.lang.Math;
public class NumbersDemo
{
    public static void main(String [] args)
    {
        int a = 2;
        int b = 3;
        displayTwiceNumber(a);
        displayTwiceNumber(b);
        displayPlusFive(a);
        displayPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
    public static void displayTwiceNumber(int n)
    {
        System.out.println("Twice of the number " + n + " is: " + n * 2);
    }
    public static void displayPlusFive(int n)
    {
        System.out.println("The number " + n + "  plus 5 equals to: " + (n + 5));
    }
    public static void displayNumberSquared(int n)
    {
        int i = (int) Math.pow(n, 2);
        System.out.println("The square of the number " + n + "  is: " + i);
    }
}
