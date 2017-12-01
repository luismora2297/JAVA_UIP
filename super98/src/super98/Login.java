package super98;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {

    @FXML
    TextField usuario;
    @FXML
    TextField password;
    @FXML
    Button btn_ingresar;

    public void ingresar(ActionEvent actionEvent) {
        Stage stage = (Stage) btn_ingresar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (IOException e) {
            System.out.println("Error con el archivo.");
        }
        Inicio controller = fxmlLoader.<Inicio>getController();
        controller.cargar_data();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
