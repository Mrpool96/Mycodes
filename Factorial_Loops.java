import java.util.Scanner;

public class Factorial_Loops {
    public static void main(String[] args) {
        int number=0;
        long fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Factorial of the number is:-");
        number =scanner.nextInt();
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;

        }
        System.out.println("Factorial of" +number+  "is" +fact );
    }
}
