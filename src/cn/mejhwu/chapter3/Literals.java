package cn.mejhwu.chapter3;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:54.
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println(Integer.toBinaryString(i1));
        int i2 = 0X2F;
        System.out.println(Integer.toBinaryString(i2));
        int i3 = 0177;
        System.out.println(Integer.toBinaryString(i3));
        char c = 0xffff;
        System.out.println(Integer.toBinaryString(c));
    }
}
