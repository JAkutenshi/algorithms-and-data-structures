package com.github.jakutenshi.algods.ds.linear;

import com.github.jakutenshi.algods.ds.DataStructure;

public interface List<V> extends DataStructure<V> {
    void remove(int index);
    void add(int index, V value);
}
