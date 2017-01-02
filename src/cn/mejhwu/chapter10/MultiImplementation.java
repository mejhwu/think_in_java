package cn.mejhwu.chapter10;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午9:21.
 */

class D {}
abstract class E {}
class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}
    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
