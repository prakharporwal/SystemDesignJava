package com.prakhar.splitwise.services.transaction;

import java.util.Map;
import java.util.Set;

import com.prakhar.splitwise.models.Transaction;

public class EqualSplitStrategy implements SplitStrategy {
    public void split(Transaction transaction){
        int totalUsers = transaction.getSplitAcrossUsers().size();
        Double totalAmount = transaction.getTotalAmount();

        Double dividedAmount = totalAmount/totalUsers;
        // 30.04 / 3 -> what to do ? -> total should be the amount
        Map<String, Double> mp = transaction.getSplitAcrossUsersMap();
        Set<Map.Entry<String, Double>> mapEntry = transaction.getSplitAcrossUsersMap().entrySet();

        String firstUserId = null;
        for (Map.Entry<String, Double> m: mapEntry) {
            m.setValue(dividedAmount);
            if(firstUserId==null)
                firstUserId = m.getKey();
        }

        mp.put(firstUserId, totalAmount - (mp.size()-1*dividedAmount));
    }
}
