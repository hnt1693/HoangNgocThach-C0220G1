package Bai3_OOP.baitap;


import javax.sound.midi.Soundbank;
import java.sql.CallableStatement;
import java.util.Date;
import java.util.Random;

public class StopWatch {
    long startTime;
    long endTime;

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
        System.out.println(stopWatch.startTime);
        int[] arr = new int[10];
        randomValue(arr);
        showArr(arr);
        minToMax(arr);
        showArr(arr);
        stopWatch.stop();
        System.out.println(stopWatch.endTime);
//        showArr(arr);
        System.out.println("thời gian để thực hiện thuật toán sắp xếp là :  " + stopWatch.timeCount() + " ms");

    }

    public StopWatch() {
        Date date = new Date(System.currentTimeMillis());
        this.startTime = date.getTime();
    }

    private long start() {
        Date date = new Date(System.currentTimeMillis());
        return this.startTime = date.getTime();
    }

    private long stop() {
        Date date = new Date(System.currentTimeMillis());
        return this.endTime = date.getTime();
    }

    public long timeCount() {
        return this.endTime - this.startTime;
    }

    public static void randomValue(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
    }

    public static void minToMax(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    public static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
