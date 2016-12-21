package cn.mejhwu.chapter3;

import java.util.Random;
import java.util.zip.Inflater;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午4:21.
 */
public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);

        int i = rand.nextInt();

        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));

        System.out.println(~i);
        System.out.println(Integer.toBinaryString(~i));

        System.out.println(-i);
        System.out.println(Integer.toBinaryString(-i));
    }
}
