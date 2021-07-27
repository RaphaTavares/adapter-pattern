package com.company;

public class PatrimonioAdapter extends PatrimonioDolar{

    private IPatrimonio patrimonioBitcoin;


    public PatrimonioAdapter(IPatrimonio patrimonioBitcoin){
        this.patrimonioBitcoin = patrimonioBitcoin;
    }

    public float recuperarPatrimonio(){

        float patrimonioCalculado = this.getPatrimonioDolar() / 37352;

        patrimonioBitcoin.setPatrimonio(patrimonioCalculado);

        return patrimonioCalculado;
    }

    public void salvarPatrimonio(){

        float patrimonioCalculado = patrimonioBitcoin.getPatrimonio() * 37352;

        this.setPatrimonioDolar(patrimonioCalculado);
    }
}
