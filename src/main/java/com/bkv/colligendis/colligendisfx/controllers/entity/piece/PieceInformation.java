package com.bkv.colligendis.colligendisfx.controllers.entity.piece;


import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.HashSet;
import java.util.Set;

@JsonDeserialize(as = CoinInformation.class)
public abstract class PieceInformation extends AbstractEntity {

    public static final String HAS_COMM_ISSUE_SERIES = "HAS_COMM_ISSUE_SERIES";
    public static final String HAS_OBVERSE = "HAS_OBVERSE";
    public static final String HAS_REVERSE = "HAS_REVERSE";
    public static final String HAS_EDGE = "HAS_EDGE";
    public static final String HAS_MINTS = "HAS_MINTS";
    public static final String HAS_VARIANT = "HAS_VARIANT";
    public static final String HAS_COMMENT = "HAS_COMMENT";


    private String name;

    private Territory territory;

    private Issuer issuer;

    private Period period;

    private Ruler ruler;


    private Integer startYear;
    private Integer startYearGregorian;
    private Integer endYear;
    private Integer endYearGregorian;

    private String calendar;

    private Value value;

    private Currency currency;

    private String composition;
    private String weight;
    private String diameter;

    private String thickness;
    private String shape;
    private String technique;
    private String orientation;

    private String demonetized;

    private String numistaNumber;
    private String references;


    private String commIssueName;
    private CommIssueSeries commIssueSeries;

    private PieceSide obverse;
    private PieceSide reverse;
    private PieceSide edge;

    private Set<Mint> mints = new HashSet<>();

    private String htmlComments;

    private Set<CoinVariant> coinVariants = new HashSet<>();

    public PieceInformation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    public Issuer getIssuer() {
        return issuer;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Ruler getRuler() {
        return ruler;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getStartYearGregorian() {
        return startYearGregorian;
    }

    public void setStartYearGregorian(Integer startYearGregorian) {
        this.startYearGregorian = startYearGregorian;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }
    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYearGregorian(Integer endYearGregorian) {
        this.endYearGregorian = endYearGregorian;
    }

    public Integer getEndYearGregorian() {
        return endYearGregorian;
    }


    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getDemonetized() {
        return demonetized;
    }

    public void setDemonetized(String demonetized) {
        this.demonetized = demonetized;
    }

    public String getNumistaNumber() {
        return numistaNumber;
    }

    public void setNumistaNumber(String numistaNumber) {
        this.numistaNumber = numistaNumber;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getCommIssueName() {
        return commIssueName;
    }

    public void setCommIssueName(String commIssueName) {
        this.commIssueName = commIssueName;
    }

    public CommIssueSeries getCommIssueSeries() {
        return commIssueSeries;
    }

    public void setCommIssueSeries(CommIssueSeries commIssueSeries) {
        this.commIssueSeries = commIssueSeries;
    }

    public PieceSide getObverse() {
        return obverse;
    }

    public void setObverse(PieceSide obverse) {
        this.obverse = obverse;
    }

    public PieceSide getReverse() {
        return reverse;
    }

    public void setReverse(PieceSide reverse) {
        this.reverse = reverse;
    }

    public PieceSide getEdge() {
        return edge;
    }

    public void setEdge(PieceSide edge) {
        this.edge = edge;
    }

    public Set<Mint> getMints() {
        return mints;
    }

    public void setMints(Set<Mint> mints) {
        this.mints = mints;
    }

    public String getHtmlComments() {
        return htmlComments;
    }

    public void setHtmlComments(String htmlComments) {
        this.htmlComments = htmlComments;
    }

    public Set<CoinVariant> getCoinVariants() {
        return coinVariants;
    }

    public void setCoinVariants(Set<CoinVariant> coinVariants) {
        this.coinVariants = coinVariants;
    }


}
