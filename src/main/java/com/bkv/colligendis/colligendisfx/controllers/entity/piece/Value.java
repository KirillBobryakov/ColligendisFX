package com.bkv.colligendis.colligendisfx.controllers.entity.piece;


import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;

public class Value extends AbstractEntity {

    private String name;
    private float nominal;
    private float rateToCurrency;

    public Value() {
    }

    public Value(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNominal() {
        return nominal;
    }

    public void setNominal(float nominal) {
        this.nominal = nominal;
    }

    public float getRateToCurrency() {
        return rateToCurrency;
    }

    public void setRateToCurrency(float rateToCurrency) {
        this.rateToCurrency = rateToCurrency;
    }
}
