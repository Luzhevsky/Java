package com.Chapter11Collections.TaskSeven;

import java.util.ArrayList;
import java.util.List;

public class TaskSeven {



    public static void main(String[] args) {

        Object[] obj = new TaskSeven[5];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new TaskSeven();
        }
        List<Object> objectList = new ArrayList<>();

        for (int i = 0; i < obj.length; i++) {
            objectList.add(obj[i].hashCode());
        }
        System.out.println(objectList);

        List<Object> sub = objectList.subList(0,2);
        System.out.println("sub : " + sub);
        objectList.removeAll(sub);
        System.out.println(objectList);
    }

}
