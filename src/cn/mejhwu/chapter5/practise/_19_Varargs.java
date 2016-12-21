package cn.mejhwu.chapter5.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午7:40.
 */
public class _19_Varargs {
    public static void f(String... args) {
        for (String str : args) {
            System.out.println(str);
        }
    }

    static void f(float i, char... args) {
        System.out.println("first");
    }

    static void f(char d, char... args) {
        System.out.println("second");
    }

    static void f(int d, char... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f("1", "2", "3", "4");
        f(1, 'a');
        f('a', 'b');
    }

}
