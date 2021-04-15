package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/21 13:19
 */
public class demo05 {
    public static void main(String[] args) {
        System.out.println("输入考试成绩：");
        Scanner scanner= new Scanner(System.in);
        int score = scanner.nextInt();
        switch (score/10){
            case 10:
                System.out.println("给你买辆车");
                break;
            case 90:
                System.out.println("MP3");
                break;
            case 80:
            case 70:
            case 60:
                System.out.println("买本参考书");
                break;
            default:
                System.out.println("啥都不买");
                break;



        }
    }
}
