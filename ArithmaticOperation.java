public class ArithmaticOperation {
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1,int num2,int num3,int num4)
    {
        return num1+num2+num3+num4;
    }

    public static void main(String[] args) {
        ArithmaticOperation obj=new ArithmaticOperation();
        System.out.println("Sum of the two numbers:-"+obj.add(10,20));
        System.out.println("Sum of the three number:-"+obj.add(10,20,30));
        System.out.println("Sum of the four numbers:-"+obj.add(10,20,30,40));
    }

}
