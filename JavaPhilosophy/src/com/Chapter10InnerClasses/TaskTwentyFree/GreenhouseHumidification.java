package com.Chapter10InnerClasses.TaskTwentyFree;

public class GreenhouseHumidification extends GreenhouseController{
    private boolean Humidification = true;
    public class HumidificationOn extends Event {
        public HumidificationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            Humidification = true;
        }

        @Override
        public String toString() {
            return "Увлажнение оранжереи включено";
        }
    }
    public class HumidificationOff extends Event {
        public HumidificationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            Humidification = false;
        }

        @Override
        public String toString() {
            return "Увлажнение оранжереи выключено";
        }
    }
}
