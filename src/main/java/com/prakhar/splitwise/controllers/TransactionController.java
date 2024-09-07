package com.prakhar.splitwise.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.splitwise.models.Transaction;
import com.prakhar.splitwise.models.User;
import com.prakhar.splitwise.services.user.UserService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final UserService userService;

    @Autowired
    public TransactionController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    ResponseEntity<List<Transaction>> listTransactions(@RequestBody User a){
        List<Transaction> out = new ArrayList<>();

        userService.getAggregateBalanceWithUser(a, a);
        
        return out;
    }
}
