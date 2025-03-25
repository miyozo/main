package zero;

import java.util.Scanner;

public class Test6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            char op = sc.next().charAt(0);
            int b = sc.nextInt();
            
            if(op == '+'){
                System.out.println(a + b);
            }else if(op == '-'){
                System.out.println(a - b);
            }else if(op == '*'){
                System.out.println(a * b);
            }else if(op == '/'){
                System.out.println(a / b);
            }else{
                break;
            }
        }
    }
}