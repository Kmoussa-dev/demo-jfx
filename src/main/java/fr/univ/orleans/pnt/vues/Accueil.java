package fr.univ.orleans.pnt.vues;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//Vue en JFX pur
public class Accueil implements Vue{

    private Stage stage;//le théatre
    private Scene scene;//le scene correspondante ici à la vue Acceuil

    private BorderPane borderPane;//le conteneur
    private Button creationPersonne;//bouton
    private Button affichagePersonnes;//bouton

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    private Accueil(){

    }
    public static Accueil creer(Stage stage) {
        Accueil accueil = new Accueil();
        accueil.setStage(stage);
        accueil.initialiserComposants();
        return accueil;
    }

    private void initialiserComposants() {
       //initialisation des composants de base
        this.borderPane = new BorderPane();
        this.affichagePersonnes = new Button("Afficher les personnes enregistrées") ;
        this. creationPersonne = new Button( "Enregistrer une nouvelle personne") ;
        //taille des messages
        this.affichagePersonnes.setMaxWidth(Double.MAX_VALUE);
        this.creationPersonne.setMaxWidth(Double.MAX_VALUE);
        //Gestion des boutons dans un vertical box
        VBox vBox = new VBox();
        vBox. setAlignment (Pos.CENTER) ;//centrer les messages
        vBox. setSpacing(20) ;//espace entre les messages
        vBox.getChildren().addAll(this.creationPersonne,this.affichagePersonnes);//ajout des messages concernés
        this.borderPane.setCenter(vBox);//ajout du vertical box dans le conteneur
        //création d'un nouveau label
        Label label = new Label( "Menu") ;
        label.setFont (Font. font (32) );//taille des écriture
        this.borderPane.setTop(label);//position du label dans le conteneur
        //gestion des differentes positions dans le conteneur
        BorderPane. setAlignment (label, Pos. CENTER) ;
        BorderPane.setAlignment(vBox,Pos.CENTER);
        this. setScene(new Scene(this.borderPane,  600, 700)) ;//créattion de la vue dans une scene particulière
    }
        @Override
        public void show() {
            this.stage.setScene(this.scene);//choix de la vue à travers la scène concernée
            this.stage.show();
        }
    }


