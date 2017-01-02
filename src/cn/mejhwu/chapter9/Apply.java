package cn.mejhwu.chapter9;

import cn.mejhwu.chapter5.ArrayClassObj;

import java.util.Arrays;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午5:49.
 */

abstract class Processor {
    String name() {
        return getClass().getCanonicalName();
    }
    abstract Object process(Object input);
}

class UpCase extends Processor {
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Process " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition" +
            "incorrect.";
    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }
}
