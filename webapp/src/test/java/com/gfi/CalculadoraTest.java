package com.gfi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculadoraTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculadoraTest.class );
    }

    public void testSumarPositivos()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(9,5);
        assertEquals(resultado,resultadoEsperado );
    }
    public void testSumarNegativos()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(19,-5);
        assertEquals(resultado,resultadoEsperado );
    }
    public void testSumarCero()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(14,0);
        assertEquals(resultado,resultadoEsperado );
    }
    public void testSumarDosNegativos()
    {
        int resultadoEsperado=-14;
        int resultado=Calculadora.suma(-9,-5);
        assertEquals(resultado,resultadoEsperado );
    }
}