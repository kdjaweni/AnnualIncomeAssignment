import java.util.Scanner;
public class whatIfCompletionActivity
{
    public static void main(String[] args)
    {
        int num1, num2,sum,product;
        double  average;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("First number? :");
        num1= keyboard.nextInt();
        System.out.println("Second number? :");
        num2= keyboard.nextInt();

        sum = num1+num2;
        if ( sum > 200)
            System.out.println( "Sum = " + sum + "*");
        else if (sum < 1000 )
            System.out.println("Sum = " + sum + "~");
        else

        System.out.println("Sum = " + sum);

        product = num1*num2;
        System.out.println("Product = " + product);
        average = sum/2;
        System.out.println("Average = " + average);


    }
}
