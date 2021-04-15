package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/3/21 10:06
 */
public class demo01 {
    public static void main(String[] args) {
        int days = 46;
        int week = days/7;
        System.out.println("周数是:" +week);
         int left = days % 7;
        System.out.println(left);
        double pi = 3.14159;
        double radius = 1.5;
        double area = pi *radius*radius;
        System.out.println("面积是"+area);
    }
}
