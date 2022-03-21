import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        System.out.println("The sym is " + sumMultiples(n));
    }

    public static int sumMultiples (int n){

        int count =0;
        for(int i = 0;i<=n;i++){
            if (i %3 == 0 || i%5 ==0){
                count +=i;
            }

            }
        return count;
        }

    }

