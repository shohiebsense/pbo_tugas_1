package sample;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    public Label helloWorld;
    public ImageView imageView;

    public void olah(ActionEvent actionEvent) {
        helloWorld.setText("ganteng");

    }

    public void generateLIngkaranBeririsanImage(Stage stage){
        File file = new File("src/lingkaran_beririsan.jpg");
        /*final ImageView imageView = new ImageView();*/
        Image image1 = new Image(file.toURI().toString());

        imageView.setImage(image1);
    }

    public void generateLIngkaranBersinggungan(Stage stage){
        File file = new File("src/lingkaran_bersinggungan.PNG");
        Image image1 = new Image(file.toURI().toString());

        imageView.setImage(image1);
    }

    public void generateLIngkaranTidakBersinggungan(Stage stage){
        File file = new File("src/lingkaran_tidak_bersinggungan.jpg");
        Image image1 = new Image(file.toURI().toString());

        imageView.setImage(image1);
    }


}
