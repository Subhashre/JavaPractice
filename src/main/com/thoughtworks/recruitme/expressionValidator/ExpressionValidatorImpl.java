package com.thoughtworks.recruitme.expressionValidator;

import java.util.Stack;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

public class ExpressionValidatorImpl implements ExpressionValidator {
    public boolean isBalancedExpression(String expression) throws MethodNotImplementedException {
    	
    	char[] chars = expression.toCharArray();
    	Stack<Character> stack = new Stack<>();
    	for(Character c : chars) {
    		switch (c) {
			case '(':
				stack.push('(');
				break;
			case '{':
				stack.push('{');
				break;
			case '[':
				stack.push('[');
				break;
			case ')':
				if(!stack.isEmpty())
					stack.pop();
				break;
			case '}':
				if(!stack.isEmpty())
				stack.pop();
				break;
			case ']':
				if(!stack.isEmpty())
				stack.pop();
				break;
			default:
				break;
			}
    	}
    	if(stack.isEmpty())
    		return true;
    	return false;
    	//throw new MethodNotImplementedException("isBalancedExpression");
        
        
    }
}
