package cn.mejhwu.chapter4.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午4:34.
 */

import java.util.Arrays;

/**
 * 4位吸血鬼数字
 */
public class _10_VampireNumber {

    public static void vampireNum() {
        String[] num = null;
        String[] res = null;
        for (int i = 10; i < 100; i++) {
            for (int j = i+1; j < 100; j++) {
                int n = i * j;
                if (n > 9999 || n < 1000) {
                    continue;
                }
                num = String.valueOf(n).split("");
                res = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(num);
                Arrays.sort(res);
                if (Arrays.equals(num, res)) {
                    System.out.println(n + " = " + i + " * " + j);
                }
            }
        }
    }

    public static void vampireNumberEffient() {
        String[] num = null;
        String[] res = null;
        for (int i = 10; i < 100; i++) {
            for (int j = i+1; j < 100; j++) {
                int n = i * j;
                if (n % 100 == 0 || (n - i -j) % 9 != 0) {
                    continue;
                }
                num = String.valueOf(n).split("");
                res = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(num);
                Arrays.sort(res);
                if (Arrays.equals(num, res)) {
                    System.out.println(n + " = " + i + " * " + j);
                }
            }
        }
    }
    public static void main(String[] args) {
        vampireNum();
        vampireNumberEffient();
    }
}
