package zero;

import java.util.Scanner;

public class Sample2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H= sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if((x-r>=0 && y-r>=0) && (W>=0 && H>=0)){
            System.out.println("Yes");
            } else{
                System.out.println("No");
            }
    }
}
