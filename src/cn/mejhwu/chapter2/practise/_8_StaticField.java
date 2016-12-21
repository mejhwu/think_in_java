package cn.mejhwu.chapter2.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午12:27.
 */
public class _8_StaticField {
    static int i = 9;
    public static void main(String[] args) {
        _8_StaticField[] ss = new _8_StaticField[10];
        for (int i = 0; i < 10; i++) {
            ss[i] = new _8_StaticField();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ss[i].i);
        }
    }
}
