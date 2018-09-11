
import java.io.*;
import java.util.*;
public class V{
    public static void main (String []args)
    {
        String s;
        System.out.println("enter a name :");
        Scanner y = new Scanner(System.in);
        s= y.next();
        int n = s.length();
        int g=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
             System.out.print("vowel ");
            }
            else {
                System.out.print("consonant ");
            }
        }


    }


}