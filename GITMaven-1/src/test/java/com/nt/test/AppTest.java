package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest 
{
    @Test
    public void testWithPositives()
    {
    	Arithmetic ar=new Arithmetic();

    	int expected=50;
    	int actual=ar.sum(30, 20);//20  20
    	assertEquals(expected, actual);
    }

	 @Test
	public void testWithNegatives()
	{
		Arithmetic ar=new Arithmetic();
		int expected=-30;
		int actual=ar.sum(-10,-20); //-20 20
		assertEquals(expected, actual);
	}

    @Test
    public void testWithZero()
    {
    	Arithmetic ar=new Arithmetic();
    	int expected=0;
    	int actual=ar.sum(0, 0);
    	assertEquals(expected, actual);
    }
}
