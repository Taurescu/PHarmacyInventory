package GUI;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.apache.log4j.Logger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;


@SpringBootApplication
public class FXApp extends Application {
    private double x;
    private double y;

   static Logger logger = Logger.getLogger("Logger");


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        logger.info("Start GUI Application!");
        //Parent root = FXMLLoader.load(getClass().getResource("../../resources/FXApp.fxml"));

        FXMLLoader loader = new FXMLLoader(new File("D:\\Root\\PHarmacyInventory\\src\\main\\resources\\FXApp.fxml").toURI().toURL());
        Parent root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });
        primaryStage.show();
    }

    @Bean
    public static void main(String[] args) {
        launch(args);
    }
}
