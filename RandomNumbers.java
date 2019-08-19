import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        int counter;
        Random rnum=new Random();
        System.out.println("Random numbers are-");
        Scanner scanner=new Scanner(System.in);
        counter= scanner.nextInt();
        for(counter=1;counter<=5;counter++){
            System.out.println(rnum.nextInt(100));

        }
    }
}
