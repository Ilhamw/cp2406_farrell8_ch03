import javax.swing.*;
public class BookstoreCredit
{
    public static void main(String [] args)
    {
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        String gpa = JOptionPane.showInputDialog(null, "Enter your grade-point avergae: ");
        double gpaNum = Integer.parseInt(gpa);
        displayResult(name, gpaNum);
    }

    public static void displayResult(String nameInput, double gpaInput)
    {
        double gpaCredit = gpaInput * 10;
        JOptionPane.showMessageDialog(null, "Name: " + nameInput + "%nGPA: " + gpaCredit + "%nBookstore Credit: " + gpaCredit);
    }
}