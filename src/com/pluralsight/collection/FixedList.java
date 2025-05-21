package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() >= maxSize) {
            throw new IllegalStateException("List is full. Max size is " + maxSize);
        }
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}