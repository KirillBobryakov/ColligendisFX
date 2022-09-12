package com.bkv.colligendis.colligendisfx.controllers.entity.piece;


public class CoinInformation extends PieceInformation{

    public COIN_TYPE coinType;

    public CoinInformation() {
    }

    public COIN_TYPE getCoinType() {
        return coinType;
    }

    public void setCoinType(COIN_TYPE coinType) {
        this.coinType = coinType;
    }

}
