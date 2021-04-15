package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/3/21 10:22
 */
public class demo02 {
    public static void main(String[] args) {
        System.out.println("**********消费单**********");
        int tixue = 245*2;
        int wangqiuxie = 570;
        int wangqiupai = 320;
        int geshu = 1;
        double jine = (tixue+wangqiupai+wangqiuxie)*0.8;
        int shiji = 1500;
        double zhaoling = shiji - jine;
        System.out.println("购买物品 \t" + "单价\t" +"个数\t" + "金额\t" );
        System.out.println("T恤\t" + tixue+"\t" + geshu*2 + "\t" + tixue*2);
        System.out.println("网球鞋\t" + wangqiuxie +"\t" +geshu+"\t" +wangqiuxie);
        System.out.println("网球拍\t" + wangqiupai +"\t" +geshu +"\t" +wangqiupai);
        System.out.println("");
        System.out.println("折扣:\t 8折");
        System.out.println("消费总金额：" +jine);
        System.out.println("实际缴费" +shiji);
        System.out.println("找钱：" +zhaoling);
    }
}
