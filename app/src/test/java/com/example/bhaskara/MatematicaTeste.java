package com.example.bhaskara;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class MatematicaTeste {
    Matematica m;

    @Before
    public void Setup(){
        m = new Matematica();

    }

    @Test
    public void CalculaPotenciaInteiroPositivo(){

        double valorEsperado = 2;
        double base = 2;
        int expoente = 1;
        double valorReal;

        valorReal = m.Exponenciacao(base, expoente);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaPotenciaZero(){

        double valorEsperado = 1;
        double base = 2;
        int expoente = 0;
        double valorReal;

        valorReal = m.Exponenciacao(base, expoente);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaPotenciaNegativa(){

        double valorEsperado = 0.25;
        double base = 2;
        int expoente = -2;
        double valorReal;

        valorReal = m.Exponenciacao(base, expoente);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaDeltaZero(){

        Matematica spyM = spy(m);

        doReturn(4.0).when(spyM).Exponenciacao(-2.0, 2);

        double entradaA, entradaB, entradaC;
        entradaA = 1;
        entradaB = -2.0;
        entradaC = 1.0;
        double valorEsperado = 0.0;
        Double valorReal;

        valorReal = spyM.calculaDelta(entradaA, entradaB, entradaC);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaDeltaNove(){

        Matematica spyM = spy(m);

        doReturn(1.0).when(spyM).Exponenciacao(-1.0,2);

        double entradaA, entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -1.0;
        entradaC = -2.0;
        double valorEsperado = 9.0;
        double valorReal;

        valorReal = spyM.calculaDelta(entradaA, entradaB, entradaC);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaDeltaMenosVinteTres(){

        Matematica spyM = spy(m);

        doReturn(9.0).when(spyM).Exponenciacao(3.0,2);

        double entradaA, entradaB, entradaC;
        entradaA = 2.0;
        entradaB = 3.0;
        entradaC = 4.0;
        double valorEsperado = -23.0;
        double valorReal;

        valorReal = spyM.calculaDelta(entradaA, entradaB, entradaC);

        assertEquals(valorEsperado, valorReal, 0.01);
    }


    @Test
    public void CalculaRaizesDeltaZero(){

        Matematica spyM = spy(m);

        doReturn(0.0).when(spyM).calculaDelta(1.0,-2.0,1.0);

        double entradaA, entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -2.0;
        entradaC = 1.0;
        double[] valorEsperado = new double[]{1.0, 1.0};
        Double[] valorReal;

        valorReal = m.calculaRaizesEq2Grau(entradaA, entradaB, entradaC);

        assertArrayEquals(valorEsperado, new double[]{valorReal[0], valorReal[1]}, 0.01);
    }

    @Test
    public void CalculaRaizesDeltaPositivo(){

        Matematica spyM = spy(m);

        doReturn(9.0).when(spyM).calculaDelta(1.0,-1.0,-2.0);

        double entradaA, entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -1.0;
        entradaC = -2.0;
        double[] valorEsperado = new double[]{2.0, -1.0};
        Double[] valorReal;

        valorReal = spyM.calculaRaizesEq2Grau(entradaA, entradaB, entradaC);

        assertArrayEquals(valorEsperado, new double[]{valorReal[0], valorReal[1]}, 0.01);
    }

    @Test
    public void CalculaRaizesDeltaMenosVinteTres(){

        Matematica spyM = spy(m);

        doReturn(-23.0).when(spyM).calculaDelta(2.0, 3.0, 4.0);

        double entradaA, entradaB, entradaC;
        entradaA = 2.0;
        entradaB = 3.0;
        entradaC = 4.0;
        double valorEsperado = -23.0;
        double valorReal;

        valorReal = spyM.calculaDelta(entradaA, entradaB, entradaC);

        assertEquals(valorEsperado, valorReal, 0.01);
    }







}
