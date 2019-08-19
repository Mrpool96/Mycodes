import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        int counter,num,item,array[];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Elements:-");
        num=input.nextInt();
        array=new int[num];
        System.out.println("Enter" +num+ "integers");
        for(counter=0;counter<num;counter++)
            array[counter]=input.nextInt();
        System.out.println("Enter the search Value:");
        item=input.nextInt();
        for(counter=0;counter<num;counter++){
            if(array[counter]==item){
                System.out.println(item+ "Is Present At Location" +(counter+1));
                break;

            }
        }
        if(counter==num)
            System.out.println(item+"Dosen't Exsist In Array.");
    }
}
