package cn.mejhwu.chapter10;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-28
 * Time: 下午1:27.
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }
    public Inner inner() {
        return new Inner();
    }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
