package com.thoughtworks.recruitme.comparator;

public interface Comparator<T> {
  T findGreater(T parameterOne, T parameterTwo) throws Exception;
}
