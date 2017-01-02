package cn.mejhwu.chapter11.practise;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-2
 * Time: 下午1:31.
 */
public class _28_DoublePriorityQueue {
    public static void main(String[] args) {
        Random rand = new Random(47);
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextDouble());
        }
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}
