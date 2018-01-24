package com.thoughtworks.recruitme.services;

import com.thoughtworks.recruitme.services.RandomError;

/**
 * Created for ThoughtWorks on 3/13/17.
 */
public class RandomException extends RuntimeException {

    private RandomError error;

    public RandomException(RandomError error){

        this.error = error;
    }

    public RandomError getError() {
        return error;
    }
}
