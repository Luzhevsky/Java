package com.Chapter10InnerClasses.TaskTwentyTwo;

public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            //код управляющий включением света
            light = true;
        }
        public String toString() {
            return "Свет включен.";
        }
    }


    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            //код управляющий включением света
            light = true;
        }
        public String toString() {
            return "Свет выключен.";
        }
    }


    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //код управляющий оборудование(водой).
            water = true;
        }
        public  String toString() {
            return "Полив включен";
        }

    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //код управляющий оборудование(водой).
            water = false;
        }
        public  String toString() {
            return "Полив выключен";
        }

    }

    private String thermostat = "День";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // код управления термостатом.
            thermostat = "Ночь";
        }
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // код управления термостатом.
            thermostat = "День";
        }
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    private boolean ventilationGreenhouse = true;
    public class VentilationGreenhouseOn extends Event {
        public VentilationGreenhouseOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //код управляющий оборудованием.
            ventilationGreenhouse = true;
        }
        public  String toString() {
            return "Проветривание включено";
        }

    }
    public class VentilationGreenhouseOff extends Event {
        public VentilationGreenhouseOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //код управляющий оборудованием.
            ventilationGreenhouse = false;
        }
        public  String toString() {
            return "Проветривание выключено";
        }

    }


    //Пример метода action(), вставляющего новый экземпляр
    //самого себя в список событий
    public class Bell extends Event { //Звонок
        public Bell(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() {
            return "ТУууууууу!";
        }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event [] eventList){
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList) {
                addEvent(e);
            }
        }
        public void action() {
            for(Event e : eventList) {
                e.start();// перезапуск каждого события
                addEvent(e);
            }
            start(); //перезапуск текущего события
            addEvent(this);
        }
        public String toString() {
            return "Перезапуск системы";
        }
    }
    public static class Terminate extends Event { //прекратить
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение";
        }
    }

}

