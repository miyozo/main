package zero;

import java.util.Scanner;

public class Test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == 0 && y == 0)break;
            if(x >= y){
                System.out.println(y + " " + x);
            }else{
                System.out.println(x + " " + y);
            }
        }
        sc.close();
    }
}
