package cn.itcast.chapter02.task02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //1.使用Random中的nextInt(int n)方法生成0～9的随机数
        int randomNumber = new Random().nextInt(10);
        System.out.println("随机数以生成！");
        //2.输入猜的数字
        System.out.println("---------请输入您猜的数字---------");
        Scanner sc = new Scanner(System.in);
        int enterNumber = sc.nextInt();
        //3.通过while循环，进行猜数字对错判断
        while (enterNumber != randomNumber) {
            if (enterNumber > randomNumber) {
                System.out.println("sorry，您猜大了！");
            } else {
                System.out.println("sorry,您猜小了！");
            }
            System.out.println("---------请输入您猜的数字：---------");
            enterNumber = sc.nextInt();

        }
        System.out.println("恭喜您，猜对了！");
    }
}
