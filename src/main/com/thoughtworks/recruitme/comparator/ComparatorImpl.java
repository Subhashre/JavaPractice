package com.thoughtworks.recruitme.comparator;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

public class ComparatorImpl<T> implements Comparator<T> {

	public T findGreater(T parameterOne, T parameterTwo) throws Exception {
		try {
			if (parameterOne instanceof Double) {
				int result = (int) ((Double) parameterOne).compareTo((Double) parameterTwo);
				if (result > 0)
					return parameterOne;
				else if (result > 0)
					return parameterTwo;
				else
					return parameterTwo;

			} else if (parameterOne instanceof Integer || parameterOne instanceof Number) {
				int result = (int) parameterOne - (int) parameterTwo;
				if (result > 0)
					return parameterOne;
				else if (result > 0)
					return parameterTwo;
				else
					return parameterTwo;

			} else if (parameterOne instanceof Float) {
				int result = (int) ((Float) parameterOne).compareTo((Float) parameterTwo);
				if (result > 0)
					return parameterOne;
				else if (result > 0)
					return parameterTwo;
				else
					return parameterTwo;

			} else if (parameterOne instanceof String) {
				int result = ((String) parameterOne).compareTo((String) parameterTwo);
				if (result > 0)
					return parameterOne;
				else if (result > 0)
					return parameterTwo;
				else
					return parameterTwo;
			} else if (parameterOne instanceof Character) {
				int result = ((Character) parameterOne).compareTo((Character) parameterTwo);
				if (result > 0)
					return parameterOne;
				else if (result > 0)
					return parameterTwo;
				else
					return parameterTwo;
			}

			return null;
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}

	}

}
