package cn.mejhwu.chapter11.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午11:18.
 */
public class _12_ListIteratorTest {
    List<Integer> list1;
    List<Integer> list2;
    public _12_ListIteratorTest() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i);
        }

    }
    public void insert() {
        ListIterator<Integer> li1 = list1.listIterator();
        ListIterator<Integer> li2 = list2.listIterator();
        System.out.println(li1.hasNext());
        System.out.println(li1.previousIndex());
        System.out.println(li2.nextIndex());
        while (li1.hasNext()) {
            li1.next();
        }
        while (li1.hasPrevious()) {
            int t = li1.previous();
            System.out.print(t + " ");
            li2.next();
            li2.set(t);
        }
    }

    public static void main(String[] args) {
        _12_ListIteratorTest lit = new _12_ListIteratorTest();
        System.out.println(lit.list1);
        lit.insert();
        System.out.println(lit.list2);
    }
}
