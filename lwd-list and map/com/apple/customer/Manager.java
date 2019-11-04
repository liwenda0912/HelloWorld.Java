package com.apple.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    public static void main(String[] args) {
        List list = new ArrayList();
        Customer customer1 = new Customer("mengbin", "123456");
        Customer customer2 = new Customer("sb", "789");
        list.add(customer1);
        list.add(customer2);
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        Map<String,Customer> map = new HashMap<>();
        map.put("001",customer1);
        System.out.println(map.get("001"));

    }
}
