import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        int fact = 1;
        for (int i = 1; i <= 12; i++)
        {
            fact = fact * i;
            System.out.println("factorial of " + i + " is " + fact);

        }
        System.out.println("factorial of 13 is out of range");
        System.out.println(" ");
        Factorial fl=new Factorial();
        fl.longFactorial();

    }
    public void longFactorial()
    {
        long fact = 1;
        for (int i = 1; i <= 20; i++)
        {
            fact = fact * i;
            System.out.println("factorial of " + i + " is " + fact);
        }
        System.out.println("factorial of 21 is out of range");
    }

}
