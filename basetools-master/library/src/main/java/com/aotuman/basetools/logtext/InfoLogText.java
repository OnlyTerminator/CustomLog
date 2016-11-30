package com.aotuman.basetools.logtext;

import android.util.Log;

/**
 * Created by aotuman on 2016/11/30.
 */

public class InfoLogText extends LogText {
    public InfoLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setUpHeader() {
        Log.i(mTag, SINGLE_DIVIDER);
    }

    @Override
    protected void setUpFooter() {
        Log.i(mTag, DOUBLE_DIVIDER);
    }

    @Override
    protected void setUpContent(String content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.i(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.i(mTag, content);
    }
}
