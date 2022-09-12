package com.bkv.colligendis.colligendisfx.controllers.entity.piece;

import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;

public class CoinVariant extends AbstractEntity {

    public static final String UNDER_MINT = "UNDER_MINT";

    private PieceInformation pieceInformation;

    private int year;
    private String date;
    private int yearGregorian;
    private String tirage;
    private String comment;

    private Mint mint;

    public CoinVariant() {
    }

    public PieceInformation getCoinInformation() {
        return pieceInformation;
    }

    public void setCoinInformation(PieceInformation pieceInformation) {
        this.pieceInformation = pieceInformation;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getYearGregorian() {
        return yearGregorian;
    }

    public void setYearGregorian(int yearGregorian) {
        this.yearGregorian = yearGregorian;
    }

    public String getTirage() {
        return tirage;
    }

    public void setTirage(String tirage) {
        this.tirage = tirage;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Mint getMint() {
        return mint;
    }

    public void setMint(Mint mint) {
        this.mint = mint;
    }
}
