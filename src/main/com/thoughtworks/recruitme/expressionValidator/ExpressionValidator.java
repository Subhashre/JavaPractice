package com.thoughtworks.recruitme.expressionValidator;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

public interface ExpressionValidator {
    boolean isBalancedExpression(String expression) throws MethodNotImplementedException;
}
