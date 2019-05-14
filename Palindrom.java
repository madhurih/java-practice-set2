import java.util.Scanner;
class Palindrom
{
    public String reverse(String temp)
    {
        String revers="";
        for(int i=temp.length()-1; i>=0; i--)
        {
            revers=revers+temp.charAt(i);

        }
        System.out.println(revers);
        return revers;
    }

    public static void main(String args[])
    {
        System.out.println("Enter The input:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String old=str;

        Palindrom obj=new Palindrom();
        String rev=obj.reverse(str);

        if (old.equals(rev))
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
    }
}
