package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorExec extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        CalculatorClass calculatorClass = new CalculatorClass(controller);
        controller.setCalculatorClass(calculatorClass);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 420, 660));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
