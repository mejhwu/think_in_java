package cn.mejhwu.chapter3;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:30.
 */
public class PassObject {
    static class Letter {
        char c;
    }

    private static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
    }
}
