package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/21 13:10
 */
public class demo04 {
    public static void main(String[] args) {
        System.out.println("请输入你的秒数:");
        Scanner scanner = new Scanner(System.in);
        double miao = scanner.nextInt();
        if(miao >= 10){
            System.out.println("恭喜你进入决赛");
            System.out.println("请输入你的性别：");
            String xingbie = scanner.next();
            if(xingbie.equals("男")){
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }
        }else{
            System.out.println("继续加油吧");
        }
    }
}
