import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Write a method that calculates the factorial of a given number.
        //Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The factorial of " + n + " is " + calculateFactoriel(n));

    }
    public static int calculateFactoriel(int n){
        int fac = 1;
        for (int i =1;i <= n;i++){

            fac *= i;

        }
        return fac;



    }
}
