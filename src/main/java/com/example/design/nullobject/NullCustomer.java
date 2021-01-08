package com.example.design.nullobject;

/**
 * @author Arte
 * @create 21-1-8
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
