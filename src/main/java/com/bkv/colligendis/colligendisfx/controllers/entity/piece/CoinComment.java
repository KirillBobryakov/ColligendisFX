package com.bkv.colligendis.colligendisfx.controllers.entity.piece;


import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;

import java.util.ArrayList;
import java.util.List;

public class CoinComment extends AbstractEntity {

    private List<String> photoLinks = new ArrayList<>();
    private String comment;

    public List<String> getPhotoLinks() {
        return photoLinks;
    }

    public void setPhotoLinks(List<String> photoLinks) {
        this.photoLinks = photoLinks;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
