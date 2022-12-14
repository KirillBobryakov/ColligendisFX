package com.bkv.colligendis.colligendisfx.controllers.entity.piece;


import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;

public class Currency extends AbstractEntity {

    private String name;
    private int startYear;
    private int endYear;
//    private String code;


    public Currency() {
    }

    public Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }
}
