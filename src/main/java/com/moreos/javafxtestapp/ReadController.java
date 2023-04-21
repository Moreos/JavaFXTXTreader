package com.moreos.javafxtestapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.*;

public class ReadController {
    @FXML
    private Label fileText;
    @FXML
    private Label fileName;

    @FXML
    public void onChooseFileButtonClick(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT docs (*.txt)", "*.txt"));
        File file = fileChooser.showOpenDialog(((Node) event.getTarget()).getScene().getWindow());
        if (file != null) {
            fileName.setText(file.getName());
            fileText.setText("");
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String str;
                while ((str = bufferedReader.readLine()) != null) {
                    fileText.setText(fileText.getText() + str + "\n");
                }
            } catch (IOException e) {
                fileText.setText("No file!");
            }

        }
    }
}