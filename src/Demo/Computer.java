package Demo;

import Elements.Keyboard;
import Elements.Monitor;
import Elements.Mouse;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer() {
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }



    public void show(){
        System.out.println(keyboard.getName());
        System.out.println(mouse.getName());
        System.out.println(monitor.getName());
    }
}
