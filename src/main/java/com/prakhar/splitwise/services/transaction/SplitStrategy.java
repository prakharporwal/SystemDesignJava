package com.prakhar.splitwise.services.transaction;

import com.prakhar.splitwise.models.Transaction;

public interface SplitStrategy {
    void split(Transaction transaction);
}
