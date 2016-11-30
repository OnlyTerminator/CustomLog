package com.aotuman.basetools;

import com.aotuman.basetools.logtext.DebugLogText;
import com.aotuman.basetools.logtext.ErrorLogText;
import com.aotuman.basetools.logtext.InfoLogText;
import com.aotuman.basetools.logtext.VerboseLogText;
import com.aotuman.basetools.logtext.WarnLogText;

/**
 * Created by aotuman on 2016/11/30.
 */

public class LogPrint implements Printer{

    @Override
    public void d(String message, String str) {
        new DebugLogText(message).setup(str);
    }

    @Override
    public void e(String message, String str) {
        new ErrorLogText(message).setup(str);
    }

    @Override
    public void e(String message, String str,Throwable throwable) {
        new ErrorLogText(message).setup(str+throwable.getMessage());
    }

    @Override
    public void w(String message, String str) {
        new WarnLogText(message).setup(str);
    }

    @Override
    public void i(String message, String str) {
        new InfoLogText(message).setup(str);
    }

    @Override
    public void v(String message, String str) {
        new VerboseLogText(message).setup(str);
    }

    @Override
    public void wtf(String message, Object... args) {

    }

    @Override
    public void json(String message, String json) {
        new InfoLogText(message).setup(json);
    }

    @Override
    public void xml(String xml) {

    }

    @Override
    public void clear() {

    }
}
