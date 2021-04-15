package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/21 12:59
 */
public class demo03 {
    public static void main(String[] args) {
        System.out.println("买彩票");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入中奖金额");
        int score = scanner.nextInt();
        if(score >= 500){
            System.out.println("买豪车");
        }else{
            System.out.println("继续买吧");
        }
    }
}
