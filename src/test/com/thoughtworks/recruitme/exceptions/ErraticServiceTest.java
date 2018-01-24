package com.thoughtworks.recruitme.exceptions;

import com.thoughtworks.recruitme.services.ErraticService;
import com.thoughtworks.recruitme.services.ExceptionService;
import com.thoughtworks.recruitme.services.RandomError;
import com.thoughtworks.recruitme.services.RandomException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for @{@link ErraticServiceImpl}
 * Can you play around with fiery exceptions ?
 */
public class ErraticServiceTest {
    @Test
    public void shouldReturnErrorCodeInCaseOfException() throws Exception {
        ErraticService erraticServiceTest = new ErraticServiceImpl();
        ExceptionService stubService = new ExceptionService();
        RandomError randomError = erraticServiceTest.execute(stubService);
        RandomException lastExceptionThrown = stubService.getLastExceptionThrown();

        Assert.assertEquals(lastExceptionThrown.getError().getCode(), randomError.getCode());
    }
}
