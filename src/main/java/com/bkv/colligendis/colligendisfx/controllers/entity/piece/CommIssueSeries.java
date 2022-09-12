package com.bkv.colligendis.colligendisfx.controllers.entity.piece;

import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;

public class CommIssueSeries extends AbstractEntity {

    private String name;
    private String numistaURL;


    public CommIssueSeries() {
    }

    public CommIssueSeries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumistaURL() {
        return numistaURL;
    }

    public void setNumistaURL(String numistaURL) {
        this.numistaURL = numistaURL;
    }
}
