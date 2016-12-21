package cn.mejhwu.chapter3.practise;

import java.util.Random;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:47.
 */
public class _7_Coins {
    public static void main(String[] args) {



        Random rand = new Random();
        int num = rand.nextInt();
        if ((num & 1) == 0) {
            System.out.println("正面");
        } else {
            System.out.println("反面");
        }
    }
}
