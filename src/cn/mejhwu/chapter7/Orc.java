package cn.mejhwu.chapter7;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午1:03.
 */

class Villain {
    private String name;
    protected void set(String name) {
        this.name = name;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name) {
        super(name);
    }

    public Orc(String name, int orcNumber) {
        this(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
