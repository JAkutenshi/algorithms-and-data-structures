package com.github.jakutenshi.algods.sort;

import com.github.jakutenshi.algods.ds.DataStructure;

import java.util.Comparator;

public interface Sorter {
    <T> T[] sort(T[] array, Comparator<T> comparator);
}
