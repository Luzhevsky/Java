package com.Chapter11Collections.TaskThirteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        Iterator it = eventList.iterator();
        
            while(it.hasNext()){
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
