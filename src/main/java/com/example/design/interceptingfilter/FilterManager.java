package com.example.design.interceptingfilter;

/**
 * @author Arte
 * @create 21-1-14
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void  filterRequest(String request) {
        filterChain.execute(request);
    }
}
