package com.example.jifen;

import android.app.Application;

public class APP extends Application {
    //是否第一次进入MainActivity
    private static boolean newSession = true;

    public static boolean getNewSession(){
        return newSession;
    }

    public static void setNewSession(){
        newSession = false;
    }
}
