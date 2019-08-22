import java.util.Scanner;

public class Calculator_SwitchCase {
    public static void main(String[] args) {
        double num1 ,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        num1= scanner.nextDouble();
        System.out.println("Enter The Second Number:");
        num2=scanner.nextDouble();
        System.out.println("Enter the Operator(+,-,*,/):-");
        char operator=scanner.next().charAt(0);
        scanner.close();
        double output;
        switch (operator){
            case '+':
                output= num1+num2;
                break;

                case '-':
                 output= num1-num2;
                 break;

                case '*':
                    output= num1*num2;
                    break;

                case '/':
                 output= num1/num2;
                 break;
            default:
                     System.out.println("You have entered wrong operator");
                     return;

        }
        System.out.println(num1+""+operator+""+num2+":"+output);


    }
}
