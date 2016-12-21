package cn.mejhwu.utils;
import java.io.PrintStream;
/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:18.
 */
public class Print {
    public static void println(Object obj) {
        System.out.println(obj);
    }
    public static void println() {
        System.out.println();
    }
    public static void print(Object obj) {
        System.out.print(obj);
    }
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, format);
    }
}
