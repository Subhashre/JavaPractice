package com.thoughtworks.recruitme.exceptions;

import com.thoughtworks.recruitme.services.StackTrace;

public class StackTraceImpl implements StackTrace {
    public void clearStackTrace() throws Exception {
        method1();
    }

    private void method1() throws Exception {
        method2();
    }

    private void method2() throws Exception {
        method3();
    }

    private void method3() throws Exception {
        throw new Exception("Exceptiom from method3");
    }
}
