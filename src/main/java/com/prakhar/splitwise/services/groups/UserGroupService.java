package com.prakhar.splitwise.services.groups;

import java.util.List;

import com.prakhar.splitwise.models.Transaction;
import com.prakhar.splitwise.models.User;

public class UserGroupService {
    List<User> users;
    List<Transaction> transactions;
    public void addToGroup(User user){
        users.add(user);
    }

    public void addExpense(Transaction transaction){
        transactions.add(transaction);
    }
}
