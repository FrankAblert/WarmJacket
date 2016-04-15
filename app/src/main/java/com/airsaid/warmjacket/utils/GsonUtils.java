package com.airsaid.warmjacket.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by zhouyou on 2016/4/9
 */
public class GsonUtils {

    private static Gson gson;

    public static Gson getInstance(){
        if(gson == null){
            gson = new GsonBuilder().create();
        }
        return gson;
    }
}
