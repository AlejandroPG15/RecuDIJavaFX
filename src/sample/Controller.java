package sample;

import com.sun.prism.paint.Color;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public Button bAzul, bRojo, bAmarillo;

    @FXML
    public Label lAzul, lRojo, lAmarillo;

    @FXML

    private void ratonClick (MouseEvent event){
        System.out.println("Abriendo Ventana");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void ratonEncimaAz (MouseEvent event){
        lAzul.setText("Azul");
    }

    @FXML
    private void ratonEncimaRo (MouseEvent event){
        lRojo.setText("Rojo");
    }

    @FXML
    private void ratonEncimaAm (MouseEvent event){
        lAmarillo.setText("Amarillo");
    }

    @FXML
    private void ratonFueraAz (MouseEvent event){
        lAzul.setText("label");
    }

    @FXML
    private void ratonFueraRo (MouseEvent event){
        lRojo.setText("label");
    }

    @FXML
    private void ratonFueraAm (MouseEvent event){
        lAmarillo.setText("label");
    }

}
