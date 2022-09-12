module com.bkv.colligendis.colligendisfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.json;
    requires org.apache.commons.io;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;

    opens com.bkv.colligendis.colligendisfx to javafx.fxml;
    exports com.bkv.colligendis.colligendisfx;
    exports com.bkv.colligendis.colligendisfx.controllers;
    opens com.bkv.colligendis.colligendisfx.controllers to javafx.fxml;
    exports com.bkv.colligendis.colligendisfx.controllers.entity;
    opens com.bkv.colligendis.colligendisfx.controllers.entity to javafx.fxml;
    exports com.bkv.colligendis.colligendisfx.controllers.entity.piece;
    opens com.bkv.colligendis.colligendisfx.controllers.entity.piece to javafx.fxml;
}