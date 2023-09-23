package com.org.example.run;

import com.org.example.func.printEx;

public class runGui implements Runnable{
    public runGui() {
		// put your code here to init, such as loading config.
	}
    
    @Override
    public void run() {
        printEx.debug("Run as GUI");
        // put your code here, such as show the window, add comps to window.
    }
}
