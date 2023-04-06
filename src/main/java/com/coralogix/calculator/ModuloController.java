package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.ModuloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Mod")
public class ModuloController {

    @Autowired
    private ModuloService ModuloService;

    @GetMapping
    public Result Mod(@RequestParam int a, @RequestParam int b) {
        return ModuloService.Mod(a, b);
    }
}
