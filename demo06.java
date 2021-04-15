package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/21 13:46
 */
public class demo06 {
    public static void main(String[] args) {
        System.out.println("你合格了吗(y/n)");
        Scanner scanner = new Scanner(System.in);
        String lala = scanner.next();
        while(lala.equals("n")){
            System.out.println("上午阅读教材");
            System.out.println("下午敲代码");
            System.out.println("合格了吗（y/n）");
            lala = scanner.next();
        }
        System.out.println("恭喜完成学习任务");
    }
}
