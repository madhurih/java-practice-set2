import java.util.Scanner;

public class palindrome2
{
    public static void main(String args[]) {
        System.out.println("Enter input:");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();

        palindrome2 obj=new palindrome2();
        String rev=obj.reverse(s1);

        if(rev.equals(s1))
        {
            System.out.println("palindrome");
        }
        else
            System.out.println("not a palindrome");
    }

    public String reverse(String temp)

    {
        StringBuilder s2=new StringBuilder(temp);
        String s3=s2.reverse().toString();
        System.out.println(s3);
        return s3;

    }
}