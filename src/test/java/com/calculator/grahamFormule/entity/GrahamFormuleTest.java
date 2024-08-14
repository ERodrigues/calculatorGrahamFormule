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

    @Test
    public void should_return_zero_when_lpa_is_one_and_vpa_is_zero(){
        grahamFormule = new GrahamFormule(0.0, 1.0);
        assertEquals(grahamFormule.calculate(), 0.0);
    }

    @Test
    public void should_return_zero_when_lpa_is_zero_and_vpa_is_one(){
        grahamFormule = new GrahamFormule(1.0, 0.0);
        assertEquals(grahamFormule.calculate(), 0.0);
    }

    @Test
    public void should_return_4_74_when_vpa_is_one_and_lpa_is_one(){
        grahamFormule = new GrahamFormule(1.0, 1.0);
        assertEquals(grahamFormule.calculate(), 4.74);
    }

    @Test
    public void should_return_23_72_when_vpa_is_five_and_lpa_is_five(){
        grahamFormule = new GrahamFormule(5.0, 5.0);
        assertEquals(grahamFormule.calculate(), 23.72);
    }
}