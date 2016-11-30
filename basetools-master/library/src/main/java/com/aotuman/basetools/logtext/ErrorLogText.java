package com.aotuman.basetools.logtext;

import android.util.Log;

/**
 * Created by aotuman on 2016/11/30.
 */

public class ErrorLogText extends LogText {

    public ErrorLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setUpHeader() {
        Log.e(mTag, SINGLE_DIVIDER);
    }

    @Override
    protected void setUpFooter() {
        Log.e(mTag, DOUBLE_DIVIDER);
    }

    @Override
    protected void setUpContent(String content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.e(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.e(mTag, content);
    }
}
