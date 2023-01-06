package com.github.jakutenshi.algods.ds.set;

import com.github.jakutenshi.algods.ds.DataStructure;

public interface Set<V> extends DataStructure<V> {
    boolean contains(V value);
}
