package com.prakhar.splitwise.services.transaction;

import java.util.Map;
import java.util.Set;

import com.prakhar.splitwise.models.Transaction;

public class UnequalByPercentSplitStrategy implements SplitStrategy {
    public void split(Transaction transaction){
        // data should be present already
        // convert the percent to Amount by multiplying totalAmount
        Double totalAmount = transaction.getTotalAmount();

        Map<String, Double> mp = transaction.getSplitAcrossUsersMap();
        Set<Map.Entry<String, Double>> mapEntry = transaction.getSplitAcrossUsersMap().entrySet();

        Double totalAmountWithoutOneUser = 0.0;
        String firstUserId = null;
        for (Map.Entry<String, Double> m: mapEntry) {
            Double currUserAmount = totalAmount*m.getValue();
            m.setValue(totalAmount*m.getValue());

            if(firstUserId == null)
                firstUserId = m.getKey();
            else
                totalAmountWithoutOneUser += currUserAmount;
        }

        // if split is 33.33 -> 99.99 for 100 -> how to adjust
        mp.put(firstUserId, totalAmount - totalAmountWithoutOneUser);
    }
}
