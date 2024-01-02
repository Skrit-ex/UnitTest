package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger log = Logger.getLogger(Calculator.class.getName());

    public int calculate(int a, int b, String type){
        log.log(Level.INFO, "Calculate with " + a + " " + b + " " + type);
        switch (type){
            case "sum":
                return a+b+1;
        }
        throw new RuntimeException();
    }
}
