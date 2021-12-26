package fr.univ.orleans.pnt.vues;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class EnregistrementPersonne implements Vue {

    private Stage stage;//theatre dans lequel il y a les vues
    private Scene scene;//scene concerné par cette vue

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    public static EnregistrementPersonne creer(Stage stage){//constructeur de la vue
        URL location = EnregistrementPersonne.class.getResource("enregistrementPersonne.fxml");//Url va servir à fusionner les deux repertoire pour trouver la vue
        FXMLLoader fxmlLoader = new FXMLLoader(location);//l'objet qui sert à charger un fichier fxml
        try {
        BorderPane borderPane = fxmlLoader.load();//je charge le conteneur dans lequel la vue se trouve
        EnregistrementPersonne vue = fxmlLoader.getController();//chargement de la classe qui controlle la vue pas du controller dans le package controller qui va servir de chef d'orchestre
        vue. setStage(stage);//association de la vue au théatre
        vue. setScene(new Scene (borderPane, 600,  700)) ;////association de la vue à la scene avec taille de notre vue
        return vue;

    } catch (IOException e) {
            throw new RuntimeException("Problème FXML : enregistrementPersonne. fxml");
        }
    }

    @Override
    public void show() {
        this.stage.setScene(this.scene);//choix de la scene concernée
        this.stage.show();//on montre la vue
    }
}
