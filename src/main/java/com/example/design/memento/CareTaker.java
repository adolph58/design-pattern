package com.example.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arte
 * @create 21-1-7
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
