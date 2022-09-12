package com.bkv.colligendis.colligendisfx.controllers.entity.piece;

import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonRootName;

public class Period extends AbstractEntity{

    private String name;
    private int startYear;
    private int startYearGregorian;
    private int endYear;
    private int endYearGregorian;

    public Period() {
    }

    public Period(String name) {
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

    public int getStartYearGregorian() {
        return startYearGregorian;
    }

    public void setStartYearGregorian(int startYearGregorian) {
        this.startYearGregorian = startYearGregorian;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getEndYearGregorian() {
        return endYearGregorian;
    }

    public void setEndYearGregorian(int endYearGregorian) {
        this.endYearGregorian = endYearGregorian;
    }

}
