package com.bkv.colligendis.colligendisfx.controllers;

import com.bkv.colligendis.colligendisfx.ColligendisFXApplication;
import com.bkv.colligendis.colligendisfx.JsonReader;
import com.bkv.colligendis.colligendisfx.controllers.entity.AbstractEntity;
import com.bkv.colligendis.colligendisfx.controllers.entity.piece.CoinInformation;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import org.json.JSONArray;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class MainController {

    @FXML
    public Button menuButtonUsers;
    @FXML
    private Pane mainPane;


    @FXML
    protected void onMenuButtonUsersClick(){
        try {
            Pane pane = FXMLLoader.load(Objects.requireNonNull(ColligendisFXApplication.class.getResource("users-view.fxml")));
            mainPane.getChildren().add(pane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void getCoinInfo() {

        try {
            JSONArray json = JsonReader.readJsonFromUrl("http://localhost:8080/coininfo/1");
            System.out.println(json);
            ObjectMapper mapper = new ObjectMapper();
            List<CoinInformation> coinInformations = mapper.readValue(json.toString(), new TypeReference<>() {});

            if(coinInformations != null){
                mainPane.getChildren().add(ViewUtil.loadViewWithInit("coin-info-view.fxml", coinInformations.get(0)));

//                HBox hBox = new HBox(loadViewWithInit("piece-side-view.fxml", coinInformations.get(0).getObverse()),
//                        loadViewWithInit("piece-side-view.fxml", coinInformations.get(0).getReverse()),
//                        loadViewWithInit("piece-side-view.fxml", coinInformations.get(0).getEdge()));
//                mainPane.getChildren().add(hBox);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
