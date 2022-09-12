package com.bkv.colligendis.colligendisfx.controllers;

import com.bkv.colligendis.colligendisfx.controllers.entity.piece.CoinInformation;
import com.bkv.colligendis.colligendisfx.controllers.entity.piece.CoinVariant;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CoinInfoViewController extends AbstractController<CoinInformation> {

    public WebView descriptionWebView;
    public AnchorPane obversePane;
    public AnchorPane reversePane;
    public AnchorPane edgePane;
    public Pane featuresPane;
    public VBox coinVariantsVBox;


    @Override
    public void init(CoinInformation coinInformation) {
        if (coinInformation.getObverse() != null) {
            obversePane.getChildren().add(ViewUtil.loadViewWithInit("piece-side-view.fxml", coinInformation.getObverse()));
        }
        if (coinInformation.getReverse() != null) {
            reversePane.getChildren().add(ViewUtil.loadViewWithInit("piece-side-view.fxml", coinInformation.getReverse()));
        }
        if (coinInformation.getEdge() != null) {
            edgePane.getChildren().add(ViewUtil.loadViewWithInit("piece-side-view.fxml", coinInformation.getEdge()));
        }

        if(coinInformation.getHtmlComments() != null){
            WebEngine webEngine = descriptionWebView.getEngine();
            webEngine.loadContent(coinInformation.getHtmlComments());
        }

        List<HBox> hBoxList = new ArrayList<>();
        //Features
        if(coinInformation.getTerritory() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Territory", coinInformation.getTerritory().getName()));
        }
        if(coinInformation.getIssuer() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Issuer", coinInformation.getIssuer().getName()));
        }
        if(coinInformation.getPeriod() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Period", coinInformation.getPeriod().getName()));
        }
        if(coinInformation.getCoinType() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Coin Type", coinInformation.getCoinType().name()));
        }

        String gregorianYears = "";
        if(coinInformation.getStartYearGregorian() != null){
            gregorianYears += String.valueOf(coinInformation.getStartYearGregorian());
        }
        if(coinInformation.getEndYearGregorian() != null && coinInformation.getEndYearGregorian() > 0){
            gregorianYears += " - " + String.valueOf(coinInformation.getEndYearGregorian());
        }
        hBoxList.add(ViewUtil.createFeatureHBox("Gregorian Years", gregorianYears));
        if(coinInformation.getStartYear() != null && coinInformation.getStartYear() != coinInformation.getStartYearGregorian()){
            String years = "";
            if(coinInformation.getStartYear() != null){
                years += String.valueOf(coinInformation.getStartYear());
            }
            if(coinInformation.getEndYear() != null && coinInformation.getEndYear() > 0){
                years += " - " + String.valueOf(coinInformation.getEndYear());
            }
            hBoxList.add(ViewUtil.createFeatureHBox("Years", years));
        }
        if(coinInformation.getCalendar() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Calendar", coinInformation.getCalendar()));
        }
        if(coinInformation.getValue() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Value", coinInformation.getValue().getName()));
        }
        if(coinInformation.getCurrency() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Currency", coinInformation.getCurrency().getName()));
        }
        if(coinInformation.getComposition() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Composition", coinInformation.getComposition()));
        }
        if(coinInformation.getWeight() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Weight", coinInformation.getWeight()));
        }
        if(coinInformation.getDiameter() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Diameter", coinInformation.getDiameter()));
        }
        if(coinInformation.getThickness() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Thickness", coinInformation.getThickness()));
        }
        if(coinInformation.getShape() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Shape", coinInformation.getShape()));
        }
        if(coinInformation.getTechnique() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Technique", coinInformation.getTechnique()));
        }
        if(coinInformation.getOrientation() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Orientation", coinInformation.getOrientation()));
        }
        if(coinInformation.getDemonetized() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("Demonetized", coinInformation.getDemonetized()));
        }
        if(coinInformation.getReferences() != null){
            hBoxList.add(ViewUtil.createFeatureHBox("References", coinInformation.getReferences()));
        }

        VBox vBox = new VBox();
        vBox.getChildren().addAll(hBoxList);
        featuresPane.getChildren().add(vBox);

        //Coin Variants

        if(coinInformation.getCoinVariants() != null){
            List<CoinVariant> coinVariants = coinInformation.getCoinVariants().stream().sorted(Comparator.comparingInt(CoinVariant::getYear)).toList();


        }

    }

}
