package com.dumisani.spring.part1;

public interface UserServices {
    String addUser(String name, String surname);
    String getUser(long Id);
    String removeUser(long Id);


}
