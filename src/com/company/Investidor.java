package com.company;

public class Investidor {

    IPatrimonio patrimonio;
    PatrimonioAdapter persistencia;

    public Investidor(){
        patrimonio = new PatrimonioBitcoin();
        persistencia = new PatrimonioAdapter(patrimonio);
    }

    public void setPatrimonio(float patrimonioBitcoin){
    patrimonio.setPatrimonio(patrimonioBitcoin);
    persistencia.salvarPatrimonio();
    }

    public float getPatrimonio(){
        return persistencia.recuperarPatrimonio();
    }

    public float getPatrimonioDolar(){
        return persistencia.getPatrimonioDolar();
    }
}
