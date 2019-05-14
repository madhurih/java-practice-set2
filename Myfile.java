import java.io.*;
import java.io.File;

public class Myfile
{
    public static void main(String args[])throws Exception
    {

        File fl=new File("/home/madhuri/IdeaProjects/java-practiceset2/src/myfile.txt");
        FileReader file=new FileReader(fl);
//        int i=1;
//        while ((i=file.read())!=-1)
//        {
//            System.out.print((char)i);
//
//        }
        System.out.print("the contents of file in uppercase:");
        System.out.println();

        int j=1;
        while ((j=file.read())!=-1)
        {
            System.out.print(Character.toUpperCase((char)j));

        }
        System.out.println();
        System.out.println("Length of the file"+" "+fl.length());
    }
}
