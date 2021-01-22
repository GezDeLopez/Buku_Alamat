/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_alamat;

import buku_alamat.model.DataPersonal;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class Buku_Alamat extends Application {
    
    //Variabel Kelas
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    //list dataperson bertipe ObservableList, yang berisi data dari model DataPersonal
    private ObservableList<DataPersonal>   dataperson = FXCollections.observableArrayList();
    
    //Konstruksi untuk inisialisasi data sebagai bahan tes
    public Buku_Alamat(){
        dataperson.add (new DataPersonal ("Budu","Santoso"));
        dataperson.add (new DataPersonal ("Ahmad","Dahlan"));
        dataperson.add (new DataPersonal ("Hasyim","Asy'ary"));
        dataperson.add (new DataPersonal ("Anis","Baswedan"));
        dataperson.add (new DataPersonal ("Ridwan","Kamil"));
    
    
    }
     
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

