package cn.mejhwu.chapter3;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:25.
 */

public class Assignment {
    static class Tank {
        int level;
    }

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println(t1.level + " " + t2.level);
        t1 = t2;
        System.out.println(t1.level + " " + t2.level);
        t1.level = 27;
        System.out.println(t1.level + " " + t2.level);
    }
}
