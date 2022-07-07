package com.Chapter10InnerClasses.TaskTwentyFree;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        
        gc.addEvent(gc.new Bell(90000));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new VentilationGreenhouseOn(1000),
                gc.new VentilationGreenhouseOff(1200),
                new GreenhouseHumidification().new HumidificationOn(1400),
                new GreenhouseHumidification().new HumidificationOff(1600),
                gc.new ThermostatDay(1800)
        };

        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenhouseControls.Terminate(8000));
        gc.run();
    }
}
