package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField resultField;

    //Equation buttons handlers
    @FXML
    void pressClear(ActionEvent event) {
        calculatorClass.clear();
        calculatorClass.clearHistoryValue();
    }

    @FXML
    void pressAdd(ActionEvent event) {
        calculatorClass.saveHistoryValue();
        calculatorClass.clear();
        calculatorClass.setEquationChar('+');
    }

    @FXML
    void pressDiv(ActionEvent event) {
        calculatorClass.saveHistoryValue();
        calculatorClass.clear();
        calculatorClass.setEquationChar('/');
    }

    @FXML
    void pressDot(ActionEvent event) {
        calculatorClass.setDot();
    }

    @FXML
    void pressEqual(ActionEvent event) {
        calculatorClass.equalFunction();
    }

    @FXML
    void pressMul(ActionEvent event) {
        calculatorClass.saveHistoryValue();
        calculatorClass.clear();
        calculatorClass.setEquationChar('*');
    }

    @FXML
    void pressSub(ActionEvent event) {
        calculatorClass.saveHistoryValue();
        calculatorClass.clear();
        calculatorClass.setEquationChar('-');
    }

    //Digits buttons handlers
    @FXML
    void pressOne(ActionEvent event) {
        calculatorClass.setDigit(1);
    }

    @FXML
    void pressTwo(ActionEvent event) {
        calculatorClass.setDigit(2);
    }

    @FXML
    void pressThree(ActionEvent event) {
        calculatorClass.setDigit(3);
    }

    @FXML
    void pressFour(ActionEvent event) {
        calculatorClass.setDigit(4);
    }

    @FXML
    void pressFive(ActionEvent event) {
        calculatorClass.setDigit(5);
    }

    @FXML
    void pressSix(ActionEvent event) {
        calculatorClass.setDigit(6);
    }

    @FXML
    void pressSeven(ActionEvent event) {
        calculatorClass.setDigit(7);
    }

    @FXML
    void pressEight(ActionEvent event) {
        calculatorClass.setDigit(8);
    }

    @FXML
    void pressNine(ActionEvent event) {
        calculatorClass.setDigit(9);
    }

    @FXML
    void pressZero(ActionEvent event) {
        calculatorClass.setDigit(0);
    }

    private CalculatorClass calculatorClass;

    public void setCalculatorClass(CalculatorClass _calculatorClass){
        calculatorClass = _calculatorClass;
    }

    public TextField getResultField(){
        return resultField;
    }
}
