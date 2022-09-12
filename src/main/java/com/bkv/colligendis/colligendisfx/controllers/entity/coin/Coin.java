package com.bkv.colligendis.colligendisfx.controllers.entity.coin;


import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;
import com.bkv.colligendis.colligendisfx.controllers.entity.User;
import com.bkv.colligendis.colligendisfx.controllers.entity.piece.CoinVariant;

public class Coin extends AbstractEntity {

    public static final String WITH_COIN_VARIANT = "WITH_COIN_VARIANT";
    public static final String HAS_COIN = "HAS_COIN";

    private CoinVariant coinVariant;

    private User owner;

}
