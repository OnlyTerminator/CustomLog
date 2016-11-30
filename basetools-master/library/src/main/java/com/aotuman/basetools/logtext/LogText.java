package com.aotuman.basetools.logtext;

import com.aotuman.basetools.L;

/**
 * Created by aotuman on 2016/11/30.
 */

public abstract class LogText {
    protected static final String SINGLE_DIVIDER = "********************************************\n";
    protected static final String DOUBLE_DIVIDER = "════════════════════════════════════════════\n";

    protected String mTag;

    public LogText(String tag) {
        mTag = tag;
    }


    public void setup(String content) {
        setUpHeader();
        setUpContent(content);
        setUpFooter();

    }

    protected abstract void setUpHeader();

    protected abstract void setUpFooter();

    protected abstract void setUpContent(String content);

    protected StackTraceElement getTargetStackTraceElement() {
        // find the target invoked method
        StackTraceElement targetStackTrace = null;
        boolean shouldTrace = false;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            boolean isLogMethod = stackTraceElement.getClassName().equals(L.class.getName());
            if (shouldTrace && !isLogMethod) {
                targetStackTrace = stackTraceElement;
                break;
            }
            shouldTrace = isLogMethod;
        }
        return targetStackTrace;
    }
}
