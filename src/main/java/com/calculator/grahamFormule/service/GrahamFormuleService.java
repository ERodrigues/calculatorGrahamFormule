package com.calculator.grahamFormule.service;

import com.calculator.grahamFormule.entity.GrahamFormule;
import org.springframework.stereotype.Service;

@Service
public class GrahamFormuleService {

    public double calculate(double vpaValue, double lpaValue) {
        return new GrahamFormule(vpaValue, lpaValue).calculate();
    }
}
