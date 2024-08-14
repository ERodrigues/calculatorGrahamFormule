package com.calculator.grahamFormule.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrahamFormuleTest {

    private GrahamFormule grahamFormule;

    @Test
    public void should_return_zero_when_vpa_is_zero(){
        grahamFormule = new GrahamFormule(0.0, 0.0);
        assertEquals(grahamFormule.calculate(), 0.0);
    }

    @Test
    public void should_return_zero_when_lpa_is_zero(){
        grahamFormule = new GrahamFormule(0.0, 0.0);
        assertEquals(grahamFormule.calculate(), 0.0);
    }
}