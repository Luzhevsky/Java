package com.Chapter10InnerClasses.TaskTwentyFree;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while(eventList.size() > 0) {
            //Создать копию, чтобы избежать модификации списка
            //во время выборки элементов:
            for(Event e : new ArrayList<>(eventList)) {
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }

        }
    }
}
