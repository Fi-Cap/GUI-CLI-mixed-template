package com.org.example;

import java.util.*;

import com.org.example.func.*;

public class App {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(args));
    
    boolean isNogui = false;
    

    if (list.contains("--nogui")) {
        isNogui = true;
    }
    if (list.contains("--debug")) {
        printEx.openDebug();
    }
    // put your args processor here.

    new Main(isNogui);
   }
}


