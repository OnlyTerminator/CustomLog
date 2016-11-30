package com.aotuman.basetools.logtext;

import android.util.Log;

/**
 * Created by aotuman on 2016/11/30.
 */

public class VerboseLogText extends LogText {
    public VerboseLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setUpHeader() {
        Log.v(mTag, SINGLE_DIVIDER);
    }

    @Override
    protected void setUpFooter() {
        Log.v(mTag, DOUBLE_DIVIDER);
    }

    @Override
    protected void setUpContent(String content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.v(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.v(mTag, content);
    }
}
