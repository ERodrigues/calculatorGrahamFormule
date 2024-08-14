package com.calculator.grahamFormule.entity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GrahamFormule {

    private static final double CONSTANT_GRAHAM = 22.5;
    private Double vpa;
    private Double lpa;

    public GrahamFormule(double vpa, double lpa) {
        this.vpa = vpa;
        this.lpa = lpa;
    }

    public Double calculate() {
        return formatResult(Math.sqrt(CONSTANT_GRAHAM * lpa * vpa));
    }

    private Double formatResult(double value){
        DecimalFormat formatValue = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        return Double.valueOf(formatValue.format(value));
    }
}
