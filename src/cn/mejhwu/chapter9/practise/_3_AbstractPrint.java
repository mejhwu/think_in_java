package cn.mejhwu.chapter9.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午5:49.
 */

abstract class P {

    P() {
       print();
    }

    abstract void print();
}

public class _3_AbstractPrint extends P {
    int i = 9;
    void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        _3_AbstractPrint a = new _3_AbstractPrint();
        a.print();
    }
}
