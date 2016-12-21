package cn.mejhwu.chapter4;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午4:26.
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (; true; ) {
            inner:
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 0) {
                    System.out.println("continue");
                    continue ;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break ;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 4; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
