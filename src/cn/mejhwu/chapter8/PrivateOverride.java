package cn.mejhwu.chapter8;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午4:05.
 */
/*public class PrivateOverride {
    private void f() {
        System.out.println("private f()");

    }
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}*/
public class PrivateOverride extends Derived{
    public void f() {
        System.out.println("private f()");

    }
    public static void main(String[] args) {
        Derived po = new PrivateOverride();
//        po.f();
    }
}

class Derived {
    private  void f() {
        System.out.println("public f()");
    }
}