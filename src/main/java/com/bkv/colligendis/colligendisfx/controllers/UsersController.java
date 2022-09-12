package com.bkv.colligendis.colligendisfx.controllers;

import com.bkv.colligendis.colligendisfx.JsonReader;
import com.bkv.colligendis.colligendisfx.controllers.entity.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class UsersController {

    private static final String url = "http://localhost:8080/";

    @FXML
    private Button bRefresh;
    @FXML
    private TableView<User> tableUsers;
    @FXML
    private TextField tfID;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfLoginName;
    @FXML
    private TextField tfPasswordSHA;
    @FXML
    private Button bAddUpdate;
    @FXML
    private Button bDelete;
    @FXML
    private Button bSetNewPassword;


    private User selectedUser;

    @FXML
    public void initialize() {

        tableUsers.getColumns().clear();
        TableColumn<User, Long> columnID = new TableColumn<>("ID");
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<User, String> columnName = new TableColumn<>("Name");
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<User, String> columnLoginName = new TableColumn<>("Login Name");
        columnLoginName.setCellValueFactory(new PropertyValueFactory<>("loginName"));
        TableColumn<User, String> columnPasswordSHA = new TableColumn<>("Password SHA");
        columnPasswordSHA.setCellValueFactory(new PropertyValueFactory<>("passwordSHA"));
        tableUsers.getColumns().add(columnID);
        tableUsers.getColumns().add(columnName);
        tableUsers.getColumns().add(columnLoginName);
        tableUsers.getColumns().add(columnPasswordSHA);
        TableView.TableViewSelectionModel<User> tableViewSelectionModel = tableUsers.getSelectionModel();
        tableViewSelectionModel.setSelectionMode(SelectionMode.SINGLE);
        ObservableList<User> selectedItems = tableViewSelectionModel.getSelectedItems();

        selectedItems.addListener((ListChangeListener<User>) change -> {
            if(change.getList().size() > 0){
                User user = change.getList().get(0);
                tfID.setText(user.getId().toString());
                tfName.setText(user.getName());
                tfLoginName.setText(user.getLoginName());
                tfPasswordSHA.setText(user.getPasswordSHA());
            }

        });

    }

    @FXML
    protected void onBRefreshClick(){
        try {
            JSONArray json = JsonReader.readJsonFromUrl("http://localhost:8080/users");
            ObjectMapper mapper = new ObjectMapper();
            List<User> userList = mapper.readValue(json.toString(), new TypeReference<>() {});


            tableUsers.getItems().clear();
            tableUsers.getItems().addAll(userList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public void onBAddUpdateClick() {
        User user = selectedUser != null ? selectedUser : new User();
        if(tfName.getText().equals("")) {
            showAlert("Add or Update process", "User Name error", "User's name can't be empty", Alert.AlertType.ERROR);
            return;
        }
        if(tfLoginName.getText().equals("")) {
            showAlert("Add or Update process", "User Login Name error", "User's login name can't be empty", Alert.AlertType.ERROR);
            return;
        }
        user.setName(tfName.getText());
        user.setLoginName(tfLoginName.getText());

        try {
            URL url = new URL(UsersController.url);
            HttpURLConnection con = null;
            try {
                con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("PUT");
                con.setRequestProperty("Content-Type", "application/json");
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(user);
                con.setDoOutput(true);

                try(OutputStream os = con.getOutputStream()) {
                    byte[] input = json.getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
                }

                try(BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    showAlert("Add or Update process", "adding...", response.toString(), Alert.AlertType.INFORMATION);
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if(con != null) con.disconnect();
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    private void showAlert(String title, String header, String message, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);

        alert.showAndWait();
    }

}
