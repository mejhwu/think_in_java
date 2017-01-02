package cn.mejhwu.chapter10;

import cn.mejhwu.chapter7.ConstantFolding;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-25
 * Time: 下午5:25.
 */
public class Parcel1 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destionation {
        private String label;
        Destionation(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }
    public void ship(String dest) {
        Contents c = new Contents();
        Destionation d = new Destionation(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
