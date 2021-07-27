package com.company.test;

import com.company.Investidor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvestidorTest {

    @Test
    public void deveRetornarPatrimonioInvestidorBitcoin(){
        Investidor investidor = new Investidor();
        investidor.setPatrimonio(1);

        assertEquals(1, investidor.getPatrimonio());
    }

    @Test
    public void deveRetornarPatrimonioInvestidorDolar(){
        Investidor investidor = new Investidor();
        investidor.setPatrimonio(1);

        assertEquals(37352, investidor.getPatrimonioDolar());
    }
}
