package com.Chapter10InnerClasses.Test.GreenhouseController;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while(eventList.size() > 0) {
            //Создать копию, чтобы избежать модификации списка
            //во время выборки элементов:
            for(Event e : new ArrayList<Event>(eventList)) {
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }

        }
    }
}
