package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/3/21 13:56
 */
public class demo07 {
    public static void main(String[] args) {
        int students = 250000;
        int year = 2012;
        while (students < 1000000) {
            students = (int)(students * (1 + 0.25));
            year++;
            System.out.println(year + students);
        }
        System.out.println(year);
    }
}
