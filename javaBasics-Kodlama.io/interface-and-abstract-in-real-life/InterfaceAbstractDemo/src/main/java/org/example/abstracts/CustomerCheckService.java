package org.example.abstracts;

import org.example.entities.Customer;

public interface CustomerCheckService {

    boolean CheckIfRealPerson(Customer customer) throws Exception;
}
