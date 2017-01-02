package cn.mejhwu.chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午7:17.
 */

class RandomDouble {
    private static Random rand = new Random(47);
    public double next() {
        return rand.nextDouble();
    }
}

public class AdaptedRandomDoubles extends RandomDouble
                                    implements Readable {
    private int count;
    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
