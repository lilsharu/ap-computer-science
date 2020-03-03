package ConditionalsAndLoops.Loops;

import java.text.SimpleDateFormat;
import java.util.*;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        timedTimer();
    }

    public static void timedTimer() throws InterruptedException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedDate = dateFormat.format(date);
        long begin = System.currentTimeMillis();
        int hour = Integer.parseInt(formattedDate.substring(0, 2));
        int minute = Integer.parseInt(formattedDate.substring(3, 5));
        int second = Integer.parseInt(formattedDate.substring(6)) + 3;
        long elapsedTimeMillis = System.currentTimeMillis() - begin;
        Thread.sleep(1000 - elapsedTimeMillis);
        boolean rep = true;
        for (int h = 0; h <= 23; h++) {
            long start = System.nanoTime();
            if (rep) {
                h = hour;
            }
            for (int m = 0; m <= 59; m++){
                if (rep) {
                    m = minute;
                }
                for (int s = 0; s <= 59; s++) {
                    if (rep) {
                        s = second;
                        rep = false;
                    }
                    else {
                        start = System.nanoTime();
                    }
                    long nanoTime = System.nanoTime() - start;
                    Thread.sleep(1000 - (nanoTime / 1000000));
                    System.out.println(h + " : " + m + " : " + s);
                }
            }
        }
//        while (hour <= 23 && minute <= 59 && second <= 59) {
//            long start = System.currentTimeMillis();
//            second++;
//            if (second > 59) {
//                minute++;
//                if (minute > 59) {
//                    hour++;
//                }
//                minute %= 60;
//            }
//            second %= 60;
//            elapsedTimeMillis = System.currentTimeMillis() - start;
//            System.out.println(hour + " : " + minute + " : " + second);
//            Thread.sleep(1000 - elapsedTimeMillis);
//        }
    }
}