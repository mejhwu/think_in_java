package cn.mejhwu.chapter8;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午5:02.
 */

class Grain {
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }

    int f() {
        System.out.println("Mill");
        return 0;
    }
}

class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
    int f() {
        System.out.println("WheatMill");
        return 0;
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        m.f();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}
