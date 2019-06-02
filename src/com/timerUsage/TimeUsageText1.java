package com.timerUsage;

import java.util.Timer;
import java.util.TimerTask;

public class TimeUsageText1 {
    Timer timer = new Timer();
    int minutes = 5000, frequency = 0;
    int i = 0;

    public static void main(String[] args) {
        TimeUsageText1 timeUsageText1 = new TimeUsageText1();
        timeUsageText1.timeControl1();
        System.out.println("程序运行结束！");

    }
    public void timeControl1(){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ++frequency;
                if (frequency <= 10) {
                    System.out.println("时间控制结果: run  " + frequency + "  times");
                    Timer timer1 = new Timer();
                    timer1.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            ++i;
                            if(i <= 3){
                                System.out.println("这是内层控制的run()");
                            }else {
                                i = 0;
                                timer1.cancel();
                            }

                        }
                    }, 1500, 1000);
                }else{
                    timer.cancel();
                }

            }
        }, minutes,6000);
    }

}
