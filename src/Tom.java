import java.util.Scanner;

public class Tom {
    public static void main (String[] args){
        int n;
        System.out.println("enter a number :");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        if(n>=20 && n<=30)
        {
            if(n%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
        else {
            System.out.println("Sorry");
        }
    }
}
