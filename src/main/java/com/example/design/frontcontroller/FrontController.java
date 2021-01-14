package com.example.design.frontcontroller;

/**
 * @author Arte
 * @create 21-1-14
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        // 记录每一个请求
        trackRequest(request);
        // 对用户身份验证
        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }

}
