package com.aotuman.basetools.logtext;

import android.util.Log;

/**
 * Created by aotuman on 2016/11/30.
 */

public class WarnLogText extends LogText {
    public WarnLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setUpHeader() {
        Log.w(mTag, SINGLE_DIVIDER);
    }

    @Override
    protected void setUpFooter() {
        Log.w(mTag, DOUBLE_DIVIDER);
    }

    @Override
    protected void setUpContent(String content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.w(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.w(mTag, content);
    }
}
