package DSA.logicBuilding;

import java.util.Scanner;

public class SumOfSquare {
    public  static int sumOfSquare(int n){

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += (i * i);

        }return sum;

    }
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

        System.out.println(sumOfSquare(n));
    }
}
