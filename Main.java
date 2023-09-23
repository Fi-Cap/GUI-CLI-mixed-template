package com.org.example;

import com.org.example.run.*;

public class Main {
   
   public Main(boolean isNogui) {
	Runnable runnable;
    if (isNogui) {
        runnable = new runNogui();
    } else {
    	runnable = new runGui();
    }
    
    
	runnable.run();
   }

}
