import java.util.*;

public class Practical3 {
    public static void main(String[] args) {

        System.out.print("Enter the length in meter is : ");
        Scanner sc = new Scanner(System.in);

        int meter = sc.nextInt();

        Double feet = meter * 3.28084;

        System.out.print("\nThe length in feet : ");
        System.out.println(feet);
        System.out.println("\n");
    }
}