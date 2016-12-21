package cn.mejhwu.chapter5.practise;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-20
 * Time: 下午6:23.
 */
public class _10_Tank {
    private boolean status = false;

    public void changeStatus() {
        status = true;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (!status) {
            System.out.println("Error, Tank is full");
            changeStatus();
        }
    }

    public static void main(String[] args) {
        new _10_Tank();
        System.gc();
        System.gc();
    }
}
