package cn.mejhwu.chapter7;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午2:58.
 */
public class ConstantFolding {

    static class Value {
        int i;
        Value (int i) {
            this.i = i;
        }
    }

/*    static class Value {
        static int i;
        Value (int i) {
            this.i = i;
        }
    }*/

/*    static class Value {
        final int i;
        Value (int i) {
            this.i = i;
        }
    }*/

    static final int n1 = 5;
    static final int n2 = 6;
    static int n3 = 7;
    static int n4 = 8;
    final int n5 = 9;
    final int n6 = 10;


    static final Value v1 = new Value(5);
    static final Value v2 = new Value(6);
    static Value v3 = new Value(7);
    static Value v4 = new Value(8);
    final Value v5 = new Value(9);
    final Value v6 = new Value(10);



    public static void main(String[] args) {
        ConstantFolding cf = new ConstantFolding();

        int p1 = n1 * n2;
        int p2 = n3 * n4;
        int p3 = cf.n5 * cf.n6;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        int p4 = v1.i * v2.i;
        int p5 = v3.i * v4.i;
        int p6 = cf.v6.i * cf.v5.i;
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
