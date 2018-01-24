package com.thoughtworks.recruitme.findClassName;


public class ClassIdentifierImpl<T, E> implements ClassIdentifier<T, E> {

	public String[] identifyClasses(T parameterOne, E parameterTwo) throws Exception {
		
		String[] result = new String[2];
		result[0] = parameterOne.getClass().getSimpleName();
		result[1] = parameterTwo.getClass().getSimpleName();

		return result;
	}

}
