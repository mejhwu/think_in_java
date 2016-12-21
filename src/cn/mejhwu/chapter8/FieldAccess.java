package cn.mejhwu.chapter8;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午4:11.
 */

class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    public int getField() {
        return field;
    }
    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println(sup.field + " " + sup.getField());
        Sub sub = new Sub();
        System.out.println(sub.field + " " + sub.getField() + " " + sub.getSuperField());
    }
}
