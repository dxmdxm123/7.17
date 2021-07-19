package com.du.lianxi05;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
* 使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒时间是动态的...
* */
public class Test03 {
    public static void main(String[] args) {
        Thread thread = new Thread() {

            SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");

            //重写run()方法
            public void run() {
                while (true) {
                    String str = s.format(new Date());
                    System.out.println(str);
                    try {
                        //间隔时间1秒
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };thread.start();
    }
}
