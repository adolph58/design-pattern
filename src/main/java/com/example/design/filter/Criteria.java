package com.example.design.filter;

import java.util.List;

/**
 * @author Arte
 * @create 21-1-4
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
