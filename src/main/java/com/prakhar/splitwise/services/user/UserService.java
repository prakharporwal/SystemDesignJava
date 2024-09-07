package com.prakhar.splitwise.services.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.prakhar.splitwise.models.Transaction;
import com.prakhar.splitwise.models.User;

public class UserService {
    public User createUser(String name, String email, String phoneNum){
        return new User(name, email, phoneNum);
    }

    public String createSession(){ return "";}

    public String validateSession(){ return "";}

    public Double getAggregateBalanceWithUser(User A, User B){
        List<Transaction> transactions = new ArrayList<>(); // get all transactions on having same people a and b present

        Double totalExpenses = 0.0;
        for (Transaction t: transactions) {
            if(t.getPaidByUser() ==B.getEmailId()){
                Map<String, Double> splitMap = t.getSplitAcrossUsersMap();
                totalExpenses += splitMap.get(A.getEmailId());
            }
        }
        return totalExpenses;
    }
}
