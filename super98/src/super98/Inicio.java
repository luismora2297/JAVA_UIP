package super98;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inicio {

    @FXML
    ImageView btn_salir;
    @FXML
    Label cuenta;
    @FXML
    Label puntos;
    @FXML
    TextField cosafea;

    String c = "123456";
    double p = 0.0;

    public void cargar_data() {
        String linea = null;

        try {
            FileReader fileReader = new FileReader("petra.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((linea = bufferedReader.readLine()) != null) {
                List<String> data = Arrays.asList(linea.split(","));
                if (data.get(2).equals("COMPRA")) {
                    p += Double.parseDouble(data.get(3));
                }
                if (data.get(2).equals("VENTA")) {
                    p -= Double.parseDouble(data.get(3));
                }
            }

            bufferedReader.close();

            cuenta.setText(c);
            puntos.setText(String.valueOf(p));
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo.");
        } catch (IOException e) {
            System.out.println("Error con el archivo.");
        }
    }

    public void comprar(ActionEvent actionEvent) {
        String cf = cosafea.getText();
        try {
            FileWriter fileWriter = new FileWriter("palante.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(cf);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Nosirve...");
        }
    }

    public void consultar(ActionEvent actionEvent) {
    }

    public void salir(MouseEvent mouseEvent) {
        Stage stage = (Stage) btn_salir.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (IOException e) {
            System.out.println("Error con el archivo.");
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
