import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        double result = 0 ;
        System.out.print("Enter a number : ");
        number = input.nextInt();

        for (double i = 1 ; i <= number ; i++){
            result += ( 1/i);
        }
        System.out.println("The result is : " + result);

    }
}
