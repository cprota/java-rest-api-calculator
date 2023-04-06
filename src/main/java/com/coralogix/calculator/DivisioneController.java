package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.DivisioneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Div")
public class DivisioneController {

    @Autowired
    private DivisioneService DivisioneService;

    @GetMapping
    public Result Div(@RequestParam int a, @RequestParam int b) {
        return DivisioneService.Div(a, b);
    }
}
