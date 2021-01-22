package buku_alamat.view;

import buku_alamat.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class View_buku_alamatController {

    @FXML
    private TableView<DataPersonal> tabelPerson;

    @FXML
    private TableColumn<?, ?> kolomNamaDepan;

    @FXML
    private TableColumn<?, ?> kolomNamaBelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelKota;

    @FXML
    private Label labelNoHP;

}
