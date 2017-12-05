package com.DIYProjects.Classes;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;

public class Controller {  
    /**
     * Initialised GpioController
     */
    public static final GpioController GPIO = GpioFactory.getInstance();
}
