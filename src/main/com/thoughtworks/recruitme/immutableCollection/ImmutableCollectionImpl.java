package com.thoughtworks.recruitme.immutableCollection;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

import java.util.ArrayList;
import java.util.Collection;

public class ImmutableCollectionImpl<E> implements ImmutableCollection<E> {
    private final Collection<E> immutableCollection;

    public ImmutableCollectionImpl(Collection<E> collection) {
        this.immutableCollection = collection;
    }
    public ImmutableCollection<E> add(E e) throws Exception {
    	Collection<E> collection = new ArrayList<>(immutableCollection);
    	collection.add(e);
    	return new ImmutableCollectionImpl(collection);
    }

    public ImmutableCollection<E> remove(E e) throws Exception {
    	Collection<E> collection = new ArrayList<>(immutableCollection);
    	collection.remove(e);
    	return new ImmutableCollectionImpl(collection);
    }

    public int size() {
        return immutableCollection.size();
    }
}
