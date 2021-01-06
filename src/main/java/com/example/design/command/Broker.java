package com.example.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arte
 * @create 21-1-6
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for(Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
