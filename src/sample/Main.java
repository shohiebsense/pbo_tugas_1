package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Model.Lingkaran;
import sample.Model.Point;

import java.io.File;

import static java.lang.Math.sqrt;

public class Main extends Application {
    Lingkaran lingkaran1, lingkaran2, lingkaran3;
    Controller controller;
    @FXML
    public ImageView imageView;

    String keterangan;
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));*/
        Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        lingkaran1 = generateLingkaran(2,2,2);
        lingkaran2 = generateLingkaran(1,7,1);
        lingkaran3 = generateLingkaran(1.5,4,1.5);
        controller = loader.getController();
        controller.generateLIngkaranBeririsanImage(primaryStage);
    }

    public Lingkaran generateLingkaran(double r, double x, double y){
        return new Lingkaran(r,new Point(x,y));
    }

    public boolean cekBersinggungan(Lingkaran lingkaran1, Lingkaran lingkaran2){
        double R = sqrt(Math.pow(lingkaran1.getP().getX()-lingkaran1.getP().getY(),2) + Math.pow(lingkaran2.getP().getX()-lingkaran2.getP().getY(),2));
        if(R == (lingkaran1.getR() + lingkaran2.getR())){
            keterangan = "bersinggungan";
            return true;
        }
        else if (R > lingkaran1.getR() + lingkaran2.getR()){
            keterangan = "tidak_bersinggungan";
            return false;
        }
        else if(R < lingkaran1.getR() + lingkaran2.getR() ){
            keterangan = "beririsan";
            return false;
        }
        return false;
    }

    public double getSqrt(float r){
        return sqrt(r);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
