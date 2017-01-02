package cn.mejhwu.chapter11.practise;

import java.util.PriorityQueue;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-2
 * Time: 下午1:35.
 */
public class _29_ObjectSimple {
    public static void main(String[] args) {
        PriorityQueue<_29_ObjectSimple> priorityQueue =
                new PriorityQueue<>();

        // java.lang.ClassCastException:
        // cn.mejhwu.chapter11.practise._29_ObjectSimple cannot be
        // cast to java.lang.Comparable
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(new _29_ObjectSimple());
        }
    }
}
