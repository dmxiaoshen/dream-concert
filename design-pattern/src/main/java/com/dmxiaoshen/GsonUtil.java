package com.dmxiaoshen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hzhsg on 2018/5/16.
 */
@Slf4j
public class GsonUtil {

    private static final Gson GSON = new GsonBuilder().serializeNulls().create();

    public static String toJson(Object obj){
        return GSON.toJson(obj);
    }
}
