package zero;

import java.util.Scanner;

public class Test4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a / b;
        int r = a % b;
        double f1 = a;
        double f2 = b;
        System.out.print(d + " " + r + " ");
        System.out.printf("%.8f",f1 / f2);
    }
}