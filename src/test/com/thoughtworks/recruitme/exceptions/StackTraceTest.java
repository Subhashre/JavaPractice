package com.thoughtworks.recruitme.exceptions;

import com.thoughtworks.recruitme.services.StackTrace;
import org.junit.Assert;
import org.junit.Test;

public class StackTraceTest {
    @Test
    public void shouldClearInheritedStackTrace() {
    	
        StackTrace stacktrace = new StackTraceImpl();
        try {
            stacktrace.clearStackTrace();
        } catch (Exception e) {
            Assert.assertEquals("clearStackTrace", e.getStackTrace()[0].getMethodName());
        }
    }
}
