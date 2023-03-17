package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.SubtractionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Subr")
public class SubtractionController {

    @Autowired
    private SubtractionService subtractionService;

    @GetMapping
    public Result Subr(@RequestParam int a, @RequestParam int b) {
        return subtractionService.Subr(a, b);
    }
}
