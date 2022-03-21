import java.util.Scanner;

public class Exercise1 {
    //Write a method that sums two numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("Sum = " + sumOfInts(i,j));



    }
    public static int sumOfInts (int i,int j){
        int sum = i+j;
        return sum;
    }
    }