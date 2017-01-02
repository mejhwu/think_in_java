package cn.mejhwu.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午10:04.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while (eventList.size() > 0) {
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
