package com.aotuman.basetools;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * aotuman 2016/11/30
 */
public class L {
    private static boolean sDebug = true;
    private static String sTag = "CustomLog";
    private static final int JSON_INDENT = 2;
    private static Printer printer = new LogPrint();

    public static void init(boolean debug, String tag) {
        L.sDebug = debug;
        L.sTag = tag;
    }

    /**
     * iiiiiiiiiiiiii
     * @param content
     */
    public static void i(String content){
        i(null,content);
    }

    public static void i(String tag,String content){
        if (!sDebug) return;
        printer.i(getFinalTag(tag),content);
    }

    /**
     * vvvvvvvvvvvvvvvvvv
     * @param content
     */
    public static void v(String content){
        v(null,content);
    }

    public static void v(String tag,String content){
        if (!sDebug) return;
        printer.v(getFinalTag(tag),content);
    }

    /**
     * dddddddddddddd
     * @param content
     */
    public static void d(String content){
        d(null,content);
    }

    public static void d(String tag,String content){
        if (!sDebug) return;
        printer.d(getFinalTag(tag),content);
    }

    /**
     * wwwwwwwwwwwww
     * @param content
     */
    public static void w(String content){
        w(null,content);
    }

    public static void w(String tag,String content){
        if (!sDebug) return;
        printer.w(getFinalTag(tag),content);
    }

    /**
     * eeeeeeeeeeee
     * @param tag
     * @param params
     */
    public static void e(String tag, String params) {
        if (!sDebug) return;
        printer.e(getFinalTag(tag),params);
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (!sDebug) return;
        printer.e(getFinalTag(tag),msg,throwable);
    }

    /**
     * json----------
     * @param json
     */
    public static void json(String json) {
        json(null, json);
    }

    public static void json(String tag, String json) {
        if (!sDebug) return;
        printer.json(getFinalTag(tag),getPrettyJson(json));
    }

    private static String getPrettyJson(String jsonStr) {
        try {
            jsonStr = jsonStr.trim();
            if (jsonStr.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonStr);
                return jsonObject.toString(JSON_INDENT);
            }
            if (jsonStr.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(jsonStr);
                return jsonArray.toString(JSON_INDENT);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "Invalid Json, Please Check: " + jsonStr;
    }


    private static String getFinalTag(String tag) {
        if (!TextUtils.isEmpty(tag)) {
            return tag;
        }
        return sTag;
    }
}
