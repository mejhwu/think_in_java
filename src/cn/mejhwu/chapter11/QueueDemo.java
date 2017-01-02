package cn.mejhwu.chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-2
 * Time: 下午1:10.
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
