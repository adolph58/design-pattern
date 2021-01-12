package com.example.design.businessdelegate;

/**
 * @author Arte
 * @create 21-1-12
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
