import java.util.Scanner;

public class EvenNumTest {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else return false;
    }
    public static void main(String args[]){
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isEven(n)){
            System.out.println("given number is even");
        }
        else System.out.println("given number is not even");

    }
}
