package JavaTest;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
    public static void main(String[] args) {
        System.out.println("タイマー起動");
        TimerTask timer = new TimerTask(){
            public void run(){
                System.out.println("完了しました");
                    }
            };
        Timer timer2 = new Timer();
        timer2.schedule(timer, 3000);
    }
}
