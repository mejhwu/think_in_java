package cn.mejhwu.chapter10.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午9:25.
 */

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class _22_SequenceWithReverse {
    private Object items[];
    private int next = 0;
    public _22_SequenceWithReverse(int size) {
        items = new Object[size];
    }
    public void add(Object item) throws Exception {
        if (next >= items.length) {
            throw new Exception("array is full");
        } else {
            items[next++] = item;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return i;
        }

        @Override
        public void next(){
            if (!end()) {
                System.out.println(items[i++]);
            }
        }
    }

    private class SequenceReverseSelector implements Selector {
        private int i = items.length - 1;
        @Override
        public boolean end() {
            return i == -1;
        }

        @Override
        public Object current() {
            return i;
        }

        @Override
        public void next() {
            if (!end()) {
                System.out.println(items[i--]);
            }
        }
    }

    public Selector selector () {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new SequenceReverseSelector();
    }

    public static void main(String[] args) throws Exception{
        _22_SequenceWithReverse sequence = new _22_SequenceWithReverse(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            selector.next();
        }
        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            reverseSelector.next();
        }
    }
}
