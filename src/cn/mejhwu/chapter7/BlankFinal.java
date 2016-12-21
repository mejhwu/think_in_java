package cn.mejhwu.chapter7;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午3:13.
 */
public class BlankFinal {
    static class Poppet {
        private int i;
        Poppet(int i) {
            this.i = i;
        }
    }

    private final int i = 0;
    private final int j;
    private final Poppet p;
    private static final int VALUE = 1;
    private static int s;
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
        s = 2;
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
        s = x;
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
