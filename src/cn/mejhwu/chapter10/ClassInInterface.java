package cn.mejhwu.chapter10;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午9:08.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("howdy");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
