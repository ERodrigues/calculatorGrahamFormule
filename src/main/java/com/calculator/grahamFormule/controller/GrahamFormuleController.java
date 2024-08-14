package com.calculator.grahamFormule.controller;

import com.calculator.grahamFormule.service.GrahamFormuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/stocks/resultGrahamFormule")
public class GrahamFormuleController {
    private final GrahamFormuleService grahamFormuleService;

    public GrahamFormuleController(GrahamFormuleService grahamFormuleService) {
        this.grahamFormuleService = grahamFormuleService;
    }

    @GetMapping
    public double getResultGrahamFormule(@RequestHeader("vpa") double vpaValue, @RequestHeader("lpa") double lpaValue){
        return this.grahamFormuleService.calculate(vpaValue, lpaValue);
    }
}
