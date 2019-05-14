import java.util.Scanner;

public class Power
{
    public void powerofFour(int temp)
    {
        if (temp % 4 == 0)
        {
            System.out.println("The given no is power of 4");
        }
        else
        {
            System.out.println("The given no is not power of 4");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Power obj=new Power();
        obj.powerofFour(num);

    }
}