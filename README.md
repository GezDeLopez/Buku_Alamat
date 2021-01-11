/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_alamat;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class Buku_Alamat extends Application {
    
    //Variabel Kelas
    private Stage stageApikasi;
    private BorderPane rootAplikasi;
    private Stage stageAplikasi;
    
    @Override
    public void start (Stage primaryStage){
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");
        
        initGuiKerangka(); //fungsi inisialisai node dari GuiKerangka.fxml
        initview_buku_alamat(); //fungsi inisialisai node dari viewBukuAlamat.fxml
    }            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void initGuiKerangka(){
        try {
            FXMLLoader loader = new FXMLLoader ();
            loader.setLocation (Buku_Alamat.class.getResource("view/GuiKerangka.fxml"));
            rootAplikasi = (BorderPane) loader.load();
            
            Scene sceneAplikasi = new Scene(rootAplikasi);
            stageAplikasi.setScene(sceneAplikasi);
            stageAplikasi.show();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Buku_Alamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        
            
        }

    private void initview_buku_alamat() {
        try {
            FXMLLoader loader = new FXMLLoader ();
            loader.setLocation (Buku_Alamat.class.getResource("view/GuiKerangka.fxml"));
            AnchorPane guiIsi = (AnchorPane)loader.load();
            rootAplikasi.setCenter(guiIsi);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Buku_Alamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
          }
    }

