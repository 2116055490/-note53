package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/3/21 17:28
 */
public class demo08 {
    public static void main(String[] args) {
        System.out.println("摄氏度\t" +"华氏度");
        double sheshi =0;
        double huashi = 0;
        int tiaomu =0;
        do{
            tiaomu++;
            huashi = sheshi*9/5.0+32;
            System.out.println(sheshi+"\t"+huashi);
            sheshi += 20;
        }while( sheshi >0&&sheshi <250 &&tiaomu <10);


    }
}
