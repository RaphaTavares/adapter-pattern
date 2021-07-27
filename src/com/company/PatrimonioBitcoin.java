package com.company;

public class PatrimonioBitcoin implements IPatrimonio{

    private float patrimonioBitcoin;

    @Override
    public float getPatrimonio(){
        return this.patrimonioBitcoin;
    }

    @Override
    public void setPatrimonio(float patrimonioBitcoin){
        this.patrimonioBitcoin = patrimonioBitcoin;
    }
}
