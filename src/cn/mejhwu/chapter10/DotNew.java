package cn.mejhwu.chapter10;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-28
 * Time: 下午1:29.
 */
public class DotNew {
    public class Inner {}
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
//        DotNew.Inner dni1 = new DotNew().Inner();
    }
}
