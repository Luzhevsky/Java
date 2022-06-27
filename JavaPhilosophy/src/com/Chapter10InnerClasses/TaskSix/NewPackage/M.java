package com.Chapter10InnerClasses.TaskSix.NewPackage;

import com.Chapter10InnerClasses.TaskSix.InterfaceOne;

public class M {

    private class InnerPM implements InterfaceOne {
        private String name = "InnerPm";

        @Override
        public String returnName() {
            return name;
        }
    }

    public InterfaceOne Inner() {
        return new InnerPM();
    }


}
