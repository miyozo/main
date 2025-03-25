package zero;

import java.util.Scanner;

public class Test5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double c1 = r * r * 3.1415192;
        double c2 = 2 * r * 3.1415192;
        System.out.printf("%.6f",c1);
        System.out.print(" ");
        System.out.printf("%.6f",c2);
    }
}