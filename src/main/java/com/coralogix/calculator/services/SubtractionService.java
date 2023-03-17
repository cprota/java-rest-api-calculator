package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.springframework.stereotype.Service;

@Service
public class SubtractionService {
    public Result Subr(int a, int b) {
        int sottrai = a - b;
        return new Result(sottrai);
    }
}
