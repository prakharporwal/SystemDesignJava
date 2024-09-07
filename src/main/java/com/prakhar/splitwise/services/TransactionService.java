package com.prakhar.splitwise.services;

import org.springframework.stereotype.Service;

import com.prakhar.splitwise.models.Log;
import com.prakhar.splitwise.models.Transaction;
import com.prakhar.splitwise.services.transaction.AmountSplitContext;
import com.prakhar.splitwise.services.transaction.SplitStrategy;

@Service
public class TransactionService {

    public void addLog(Transaction transaction, String text){
        // get TransactionId and add log
        transaction.appendToLogs(new Log(text));
    }

    public void upsertATransaction(Transaction transaction) {

    }

    public Transaction splitTransaction(Transaction transaction, SplitType splitType){
        SplitStrategy st = AmountSplitContext.getStrategy(splitType);
        st.split(transaction);

        return transaction;
    }
}
