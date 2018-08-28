import javax.swing.*;
class Insurance
{
    public static void main (String args[])
    {
        int currYear;
        int birthYear;
        int premium;
        String currInput = JOptionPane.showInputDialog(null, "Enter the current year >> ");
        currYear = Integer.parseInt(currInput);
        String birthInput = JOptionPane.showInputDialog(null, "Enter the birth year >> ");
        birthYear = Integer.parseInt(birthInput);
        premium = calculatePremium(currYear, birthYear);
        JOptionPane.showMessageDialog(null, "The premium is $" + premium);
    }

    public static int calculatePremium(int curr, int birth)
    {
        final int ADDITION_FACTOR = 15;
        final int MULTIPLICATION_FACTOR = 20;
        int age = curr - birth;
        int decade = age / 10;
        int premium = (ADDITION_FACTOR + decade) * MULTIPLICATION_FACTOR;
        return premium;
    }
}