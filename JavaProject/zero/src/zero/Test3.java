package zero;

import java.util.Scanner;
public class Test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int j = 0;
        
        for(int i = a; i <= b; i++){
            if(c % i == 0){
               j++;
            }
        }
        System.out.println(j);
        sc.close();
    }
}