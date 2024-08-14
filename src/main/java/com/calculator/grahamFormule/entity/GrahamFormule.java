package com.calculator.grahamFormule.entity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GrahamFormule {

    private static final double CONSTANT_GRAHAM = 22.5;
    private final Double vpa;
    private final Double lpa;

    public GrahamFormule(double vpa, double lpa) {
        this.vpa = vpa;
        this.lpa = lpa;
        validate();
    }

    private void validate() {
        if (vpa < 0.0)
            throw new IllegalArgumentException("Not support negative vpa attribute");

        if (lpa < 0.0)
            throw new IllegalArgumentException("Not support negative lpa attribute");
    }

    public Double calculate() {
        return formatResult(Math.sqrt(CONSTANT_GRAHAM * lpa * vpa));
    }

    private Double formatResult(double value){
        DecimalFormat formatValue = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        return Double.valueOf(formatValue.format(value));
    }
}
