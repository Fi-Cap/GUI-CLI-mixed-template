package com.org.example.run;

import com.org.example.func.*;

public class runNogui implements Runnable{
    public runNogui() {
		// put your code here to init, such as loading config.
    }
    
    @Override
    public void run() {
        printEx.debug("Run as nogui");
        // put your code here, such as process the input command.
    }
}
