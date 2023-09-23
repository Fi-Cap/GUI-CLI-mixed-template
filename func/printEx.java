package com.org.example.func;

import com.org.example.AppInfo;

public class printEx {
    public static void debug(String s){
        if(AppInfo.Debug) {
        System.out.println("\u001b[33m[debug]: \u001b[3;33m"+ s +"\u001b[0m");
        }
    }

    public static void openDebug() {
        if(!AppInfo.Debug) {
            System.out.println("\u001b[3;33m[debug mode ON]\u001b[0m");
            AppInfo.Debug = true;
        }
    }

    public static void closeDebug() {
        if(AppInfo.Debug) {
            System.out.println("\u001b[3;33m[debug mode OFF]\u001b[0m");
            AppInfo.Debug = false;
        }
    }
}