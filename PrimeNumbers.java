import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int temp;
        Boolean isPrime=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num= scanner.nextInt();
                scanner.close();
                for(int i=2;i<=num/2;i++)
                {
                temp=num%i;
                if(temp==0)
                    {
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime)
                    System.out.println(num+"is a prime number");
                else
                    System.out.println(num+"is not a prime number");

    }
}
