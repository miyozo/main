package zero;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x , i = 1;
        while(true){ //強制的にwhileを回し、ある一定の条件を満たした時にbreakで繰り返し処理を抜けるテクニック
            x = sc.nextInt();
            if(x == 0)break;
            System.out.println("Case " + i + ": " + x);
            i++;
        }
    }
}
