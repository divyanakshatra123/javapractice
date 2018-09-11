import java.util.Scanner;

public class Palindrome {
    public static void main (String args[]){
        int r,temp,sum=0,k ,g;
        Scanner s = new Scanner(System.in);
        System.out.println("enter ur number");
        k = s.nextInt();

            g =temp=k;
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
    }
}




