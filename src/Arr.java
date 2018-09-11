import java.io.*;
import java.util.*;


public class Arr {


    public static void main(String[] args){

        int n,sum=0;

     //   Scanner scanner = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        String input;
        System.out.println("Enter Num");
       // String num2 = scanner.nextLine();

        do {
            input = x.next();
            if (input.matches("\\d+"))  // this is to go only if digit is entered
            {
                System.out.println("input" + input);
                try {
                    sum += Integer.parseInt(input);
                } catch (NumberFormatException ignored) {

                    System.out.println("error ooops");


                }
            }

        } while (!input.equals("q"));
        System.out.println(sum);


    }


}