package com.example.design.businessdelegate;

/**
 * @author Arte
 * @create 21-1-12
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
