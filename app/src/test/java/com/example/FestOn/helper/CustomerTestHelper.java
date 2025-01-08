package com.example.FestOn.helper;

import com.example.FestOn.contacts.Address;
import com.example.FestOn.domain.Customer;
import com.example.FestOn.domain.Genre;
import com.example.FestOn.domain.Interest;

import java.util.HashSet;
import java.util.Set;

public class CustomerTestHelper {

    public static Customer initCustomerWithOneInterest() {
        Address address = com.example.FestOn.helper.AddressTestHelper.initAddress1();
        Set<Interest> interests = new HashSet<>();
        interests.add(com.example.FestOn.helper.InterestTestHelper.initCustomInterest(Genre.EDUCATION));

        Customer customer = new Customer(1,"John", "Doe", "email@example.com", 20, "Male", address, "password", interests);
        return customer;
    }

    public static Customer initCustomerWithTwoInterests() {
        Address address = AddressTestHelper.initAddress1();
        Set<Interest> interests = InterestTestHelper.initSetOfTwoInterests(Genre.MUSIC, Genre.EDUCATION);
        Customer customer = new Customer(1,"John", "Doe", "email@example.com", 20, "Male", address, "password", interests);
        return customer;
    }
}