public class Percentages
{
    public static void main(String [] args)
    {
        double num1 = 2.0;
        double num2 = 5.0;
        computePercent(num1, num2);
        computePercent(num2, num1);

    }

    public static void computePercent(double n, double m)
    {
        double percent = (n/m * 100);
        System.out.println(n + " is " + percent + " percent of " + m);
    }

}
