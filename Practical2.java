
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter first number : ");
        int a = sc.nextInt();

        System.out.print("\nEnter second number : ");
        int b = sc.nextInt();

        
        System.out.println("\nFor Addition (+) : 1");
        System.out.println("For Substraction(-) : 2");
        System.out.println("For Multiplication(*) : 3");
        System.out.println("For Division(/) : 4");
        System.out.println("For Modulus(%) : 5\n");

        System.out.print("Enter opertation number as per show the below : ");
        int calc = sc.nextInt();

        if (calc == 1){
            System.out.print("\nYour Answer is : ");
            System.out.println(a+b);
        }
        else if(calc == 2) {
            System.out.print("\nYour Answer is : ");
            System.out.println(a-b);
        }
        else if(calc == 3) {
            System.out.print("\nYour Answer is : ");
            System.out.println(a*b);
        }
        else if(calc == 4) {
            System.out.print("\nYour Answer is : ");
            System.out.println(a/b);
        }
        else if(calc == 5) {
            System.out.print("\nYour Answer is : ");
            System.out.println(a%b);
        }

        System.out.println("\n\nThanks for  Calcution.\n\n");
    }
}
