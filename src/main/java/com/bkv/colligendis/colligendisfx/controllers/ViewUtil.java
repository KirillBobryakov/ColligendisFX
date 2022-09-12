package com.bkv.colligendis.colligendisfx.controllers;

import com.bkv.colligendis.colligendisfx.ColligendisFXApplication;
import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.io.IOException;

public class ViewUtil {

    public static HBox createFeatureHBox(String caption, String body){
        Text captionText = new Text(caption + ": ");
        captionText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 13));
        Text bodyText = new Text(body);
        bodyText.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR, 13));
        HBox hBox = new HBox(captionText, bodyText);
        hBox.setAlignment(Pos.CENTER);
        return hBox;
    }


    public static AnchorPane loadViewWithInit(String view, AbstractEntity entity){
        FXMLLoader loader = new FXMLLoader(ColligendisFXApplication.class.getResource(view));
        AnchorPane pane;
        try {
            pane = loader.load();
            ((AbstractController) loader.getController()).init(entity);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return pane;
    }

}
