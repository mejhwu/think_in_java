package cn.mejhwu.utils;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午9:21.
 */
public class Range {
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
    public static int[] range(int start, int end) {
        int size = end - start;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = start + i;
        }
        return result;
    }

    public static int[] range(int start, int end, int step) {
        int size = (end - start) / step;
        int[] result = new int[size];
        for (int i = 0; i < size; i += step) {
            result[i] = start + i;
        }
        return result;
    }
}
