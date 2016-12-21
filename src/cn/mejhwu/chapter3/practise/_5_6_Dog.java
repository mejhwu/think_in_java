package cn.mejhwu.chapter3.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午1:41.
 */
public class _5_6_Dog {
    private String name;
    private String says;
    public _5_6_Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
    public String toString() {
        return this.name + ": " + this.says;
    }

    public static void main(String[] args) {
        _5_6_Dog spot = new _5_6_Dog("spot", "Ruff");
        _5_6_Dog scruffy = new _5_6_Dog("scruffy", "Wurf");
        System.out.println(spot);
        System.out.println(scruffy);
        _5_6_Dog dog = spot;
        System.out.println(dog == spot);
        System.out.println(dog.equals(spot));
    }
}
