package cn.mejhwu.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午11:00.
 */

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        //snow1.remove(0); 出错：UnsupportedOperationException, 底层表示是数组，不能调整尺寸
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        snow3.remove(0);
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
