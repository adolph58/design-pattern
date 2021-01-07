package com.example.design.mediator;

import java.util.Date;

/**
 * @author Arte
 * @create 21-1-7
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
