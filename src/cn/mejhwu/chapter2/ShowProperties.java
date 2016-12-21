package cn.mejhwu.chapter2;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 上午11:53.
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
