package com.thoughtworks.recruitme.exceptions;


import com.thoughtworks.recruitme.services.ErraticService;
import com.thoughtworks.recruitme.services.ExceptionService;
import com.thoughtworks.recruitme.services.RandomError;

public class ErraticServiceImpl implements ErraticService {
    public RandomError execute(ExceptionService stubService){
        stubService.throwException();
        return new RandomError(-1);
    }
}
