package cn.mejhwu.chapter5;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午6:19.
 */
public class TerminationCondition {

    static class Book {
        boolean checkedOut = false;
        public Book(boolean checkedOut) {
            this.checkedOut = checkedOut;
        }
        void checkIn() {
            checkedOut = false;
        }
        protected void finalize() {
            if (checkedOut) {
                System.out.println("Error, checked out");
            }
        }
    }

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
