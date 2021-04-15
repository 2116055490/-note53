package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int java = 89;
        //int yuwen = 90;
        //int shuxue = 60;
        Scanner scanner = new Scanner(System.in);
        int diffent;  //成绩差
        double ping;   //平均分
        System.out.println("java的成绩是:" );
        int java = scanner.nextInt();
        System.out.println("语文的成绩是:" );
        int yuwen = scanner.nextInt();
        System.out.println("数学的成绩是:" );
        int shuxue = scanner.nextInt();
        System.out.println("**********");
        System.out.println("java\t" + "语文\t" + "数学\t" );
        System.out.println(java + "\t" + yuwen + "\t" + shuxue + "\t");
        System.out.println("**********");
        diffent = java - yuwen;
        System.out.println("java和语文的成绩差是:" + diffent);
        ping = (java + yuwen + shuxue)/3;
        System.out.println("三门课的平均成绩是:" + ping);
    }
}
