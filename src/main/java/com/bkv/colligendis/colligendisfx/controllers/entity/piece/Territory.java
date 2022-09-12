package com.bkv.colligendis.colligendisfx.controllers.entity.piece;


import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;

import java.util.HashSet;
import java.util.Set;

public class Territory extends AbstractEntity {

    public static final String SUB_TERRITORY = "SUB_TERRITORY";

    private String name;

    private Territory parentTerritory;

    private Set<Territory> cildrenTerritories = new HashSet<>();

    public Territory() {
    }

    public Territory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Territory getParentTerritory() {
        return parentTerritory;
    }

    public void setParentTerritory(Territory parentTerritory) {
        this.parentTerritory = parentTerritory;
    }

    public Set<Territory> getCildrenTerritories() {
        return cildrenTerritories;
    }

    public void setCildrenTerritories(Set<Territory> cildrenTerritories) {
        this.cildrenTerritories = cildrenTerritories;
    }
}
