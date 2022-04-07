package com.Chapter6.AccessControl.access.foreign;

import com.Chapter6.AccessControl.access.local.*;


public class Foreign {
    public static void main(String[] args) {
        //Задание 9. Мы не можем создать экземпляр класса поскольку он не public, а имеет пакетный доступ. Если перенести файлы в
        // одну папку то все будет работать
//        PackagedClass pc = new PackagedClass();'com.Chapter6.AccessControl.access.local.PackagedClass'
//        is not public in 'com.Chapter6.AccessControl.access.local'. Cannot be accessed from outside package
    }
}
