class Member
{
    String name;
    int age;
    double salary;
    public void display()
    {
        System.out.println("Member's name:"+name);
        System.out.println("Members age:"+age);
        System.out.println("Member's salary:"+salary);
    }
}

public class Member_variable
{
    public static void main(String args[])
    {
        Member obj=new Member();
        obj.name="Madhuri";
        obj.age=23;
        obj.salary=30000.5;
        obj.display();
    }
}