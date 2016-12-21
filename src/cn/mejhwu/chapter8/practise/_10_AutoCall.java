package cn.mejhwu.chapter8.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午4:00.
 */


class A {
    public void f() {
        System.out.println("A: f()");
    }
    public void g() {
        System.out.println("A: g()");
        f();
    }
}

public class _10_AutoCall extends A {
    public void f() {
        System.out.println("_10_AutoCall: f()");
    }

    public static void main(String[] args) {
        A a = new _10_AutoCall();
        a.g();
    }
}
