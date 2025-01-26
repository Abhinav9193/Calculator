import java.util.Scanner;
public class CalC {
    public static void main(String[] args) {
        int a,b;
        int sum, diff, mul, div;
        int n;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter choice: ");
        n = sc.nextInt();

        System.out.println("Enter first number: ");
        a=sc.nextInt();

        System.out.println("Enter second number: ");
        b=sc.nextInt();
        if(n==1)
        {
            sum = a+b;
            System.out.println("Sum is :" + sum);
        }

        if(n==2)
        {
            diff = a-b;
            System.out.println("Difference is :" + diff);
        }

        if(n==3)
        {
            mul = a*b;
            System.out.println("Multiplication is :" + mul);
        }

        if(n==4)
        {
            div = a/b;
            System.out.println("Divide is :" + div);
        }
    }
}
