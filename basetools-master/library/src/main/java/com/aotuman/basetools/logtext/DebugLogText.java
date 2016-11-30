package com.aotuman.basetools.logtext;

import android.util.Log;

/**
 * Created by aotuman on 2016/11/30.
 */

public class DebugLogText extends LogText {
    public DebugLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setUpHeader() {
        Log.d(mTag, SINGLE_DIVIDER);
    }

    @Override
    protected void setUpFooter() {
        Log.d(mTag, DOUBLE_DIVIDER);
    }

    @Override
    protected void setUpContent(String content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.d(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.d(mTag, content);
    }
}
