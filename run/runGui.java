package com.org.example.run;

import com.org.example.func.printEx;

public class runGui implements Runnable{
    @Override
    public void run() {
        printEx.debug("Run as GUI");
    }
}
