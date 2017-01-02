package cn.mejhwu.chapter9;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午6:59.
 */

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {

    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 0;
    }
}

class C3 extends C implements I2 {

    @Override
    public int f(int i) {
        return 0;
    }
}

//重载要求不同特征签名，重写要求相同特征签名、相同返回类型或者子类
//class C5 extends C implements I1 {
//    void f() {}
//}

public class C4 extends C implements I3 {
}
