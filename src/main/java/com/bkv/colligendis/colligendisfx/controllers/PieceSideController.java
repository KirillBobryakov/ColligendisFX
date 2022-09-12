package com.bkv.colligendis.colligendisfx.controllers;

import com.bkv.colligendis.colligendisfx.controllers.entity.piece.PieceSide;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class PieceSideController extends AbstractController<PieceSide>{

    public VBox detailsInfoVBox;
    @FXML
    private Label titleLabel;

    @FXML
    private ImageView sideImageView;

    @FXML
    public Label descriptionLabel;

    private PieceSide pieceSide;

    public PieceSideController() {
    }

    @Override
    public void init(PieceSide pieceSide) {
        this.pieceSide = pieceSide;
        if(pieceSide.getSideType().equals(PieceSide.REVERSE)){
            titleLabel.setText("Reverse");
        } else if(pieceSide.getSideType().equals(PieceSide.OBVERSE)){
            titleLabel.setText("Obverse");
        } else if(pieceSide.getSideType().equals(PieceSide.EDGE)){
            titleLabel.setText("Edge");
        }
        if(pieceSide.getPhotoLink() != null){
            Image image = new Image(pieceSide.getPhotoLink());
            sideImageView.setImage(image);
        }

        if(pieceSide.getDescription() != null){
            descriptionLabel.setText(pieceSide.getDescription());
        }

        detailsInfoVBox.getChildren().clear();
        List<Pane> list = new ArrayList<>();
        if(pieceSide.getScript() != null){
            list.add(ViewUtil.createFeatureHBox("Script", pieceSide.getScript()));
        }
        if(pieceSide.getLettering() != null){
            list.add(ViewUtil.createFeatureHBox("Lettering", pieceSide.getLettering()));
        }
        if(pieceSide.getUnabridgedLegend() != null){
            list.add(ViewUtil.createFeatureHBox("Unabridged Legend", pieceSide.getUnabridgedLegend()));
        }
        if(pieceSide.getTranslation() != null){
            list.add(ViewUtil.createFeatureHBox("Translation", pieceSide.getTranslation()));
        }
        if(pieceSide.getEngraver() != null){
            list.add(ViewUtil.createFeatureHBox("Engraver", pieceSide.getEngraver()));
        }
        if(pieceSide.getDesigner() != null){
            list.add(ViewUtil.createFeatureHBox("Designer", pieceSide.getDesigner()));
        }
        detailsInfoVBox.getChildren().addAll(list);
    }
}
