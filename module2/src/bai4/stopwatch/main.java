package bai4.stopwatch;

import java.util.Random;
public class main {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        int [] arr=new  int[1000];
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt();
        }
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        stopWatch.sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

}
