package cn.mejhwu.chapter5;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午6:05.
 */
public class PassingThis {
    static class Person {
        public void eat(Apple apple) {
            Apple peeled = apple.getPeeled();
            System.out.println("Yummy");
        }
    }
    static class Peeler {
        static Apple peel(Apple apple) {
            return apple;
        }
    }

    static class Apple {
        Apple getPeeled() {
            return Peeler.peel(this);
        }
    }

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
