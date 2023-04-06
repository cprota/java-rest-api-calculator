package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.MoltiplicareService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Molt")
public class MoltiplicareController {

    @Autowired
    private MoltiplicareService MoltiplicareService;

    @GetMapping
    public Result Molt(@RequestParam int a, @RequestParam int b) {
        return MoltiplicareService.Molt(a, b);
    }
}
