package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.springframework.stereotype.Service;

@Service
public class ModuloService {
    public Result Mod(int a, int b) {
        int tmpMolt = a % b;
        return new Result(tmpMolt);
    }
}
