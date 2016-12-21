package cn.mejhwu.chapter3.practise;

import cn.mejhwu.chapter3.Assignment;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:29.
 */
public class _2_Assignment {
    static class Tank {
        float level;
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
