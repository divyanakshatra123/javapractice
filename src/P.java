import java.util.Scanner;

public class P {
    public static void main (String args[]){
        int r,temp,sum=0,k ;
        int  h=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter ur number");
        k = s.nextInt();

        temp=k;
        while(k>0)
        {
            r=k%10;
            sum= sum*10+r;
            k=k/10;

        }
        if(temp==sum){
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("its not a palindrome");
        }

        while(temp>0)
        {
            r = temp%10;
            if(r%2==0)
            {
             h=h+r;
            }
            temp =temp/10;

        }
        System.out.println("the sum of the even digits is " +h);
    }
}




