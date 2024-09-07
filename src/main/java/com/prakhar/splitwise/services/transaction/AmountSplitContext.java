package com.prakhar.splitwise.services.transaction;

import com.prakhar.splitwise.services.SplitType;

public class AmountSplitContext {

    public static SplitStrategy getStrategy(SplitType s){
        switch (s){
            case EQUAL -> {
                return new EqualSplitStrategy();
            }
            case UNEQUAL_BY_AMOUNT -> {
                return new UnequalByAmountSplitStrategy();
            }
            case UNEQUAL_BY_PERCENT -> {
                return new UnequalByPercentSplitStrategy();
            }
        }
        return null;
    }
}
