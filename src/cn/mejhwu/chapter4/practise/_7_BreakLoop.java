package cn.mejhwu.chapter4.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午4:31.
 */
public class _7_BreakLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.print(i + " ");
//            if (i == 90) {
//                break;
//            }
//        }
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
            if (i == 90) {
                return;
            }
        }
    }
}
