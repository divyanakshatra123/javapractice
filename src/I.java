
import java.io.*;
import java.util.*;

public class I {

    public static void main (String []args){
        int n;
        System.out.println("enter a number :");
        Scanner g = new Scanner(System.in);

        n = g.nextInt();
        System.out.println(+n);


        for(int i=1;i<=n;i++)
        {
            for(int x=0; x<i; x++)
            {
                System.out.print(+i);
            }
        }
    }
}
