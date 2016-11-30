package com.aotuman.basetools;

interface Printer {

  void d(String message, String str);

  void e(String message, String str);

  void e(String message, String str, Throwable throwable);

  void w(String message, String str);

  void i(String message, String str);

  void v(String message, String str);

  void wtf(String message, Object... args);

  void json(String message,String json);

  void xml(String xml);

  void clear();
}
