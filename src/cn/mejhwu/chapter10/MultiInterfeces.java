package cn.mejhwu.chapter10;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午9:17.
 */

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        return new B() {};
    }
}

public class MultiInterfeces {
    static void takesA (A a) {}
    static void takesB (B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesA(x);
        takesB(y.makeB());
    }
}
