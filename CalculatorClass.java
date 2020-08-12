package sample;

import javafx.scene.control.TextField;

public class CalculatorClass {

    private final Controller controller;
    private TextField textField;
    private double historyValue;
    private char equationChar;

    public CalculatorClass(Controller _controller){
        controller = _controller;
        equationChar = ' ';
        clearHistoryValue();
        clear();
    }

    public void clearHistoryValue(){
        historyValue = 0;
    }

    public void clear(){
       textField = controller.getResultField();
       textField.setText("0");
    }

    public void setDigit(int digit){
        if(textField.getText().equals("0") || equationChar == '='){
            textField.setText("" + digit);
            if(equationChar == '='){
                clearEquationChar();
            }
        }
        else{
            textField.setText(textField.getText() + "" + digit);
        }
    }

    public void setDot(){
        if(textField.getText().contains(".")){
            return;
        }
        else{
            textField.setText(textField.getText() + ".");
        }
    }

    public void saveHistoryValue(){
        historyValue = convertNumber();
    }

    public double convertNumber(){
        return Double.parseDouble(textField.getText());
    }

    public void setEquationChar(char _equationChar){
        equationChar = _equationChar;
    }

    public void equalFunction(){
        if(equationChar == ' '){
            return;
        }

        double value = 0;
        if(equationChar == '+'){
            value = historyValue + Double.parseDouble(textField.getText());
        }
        else if(equationChar == '-'){
            value = historyValue - Double.parseDouble(textField.getText());
        }
        else if(equationChar == '*'){
            value = historyValue * Double.parseDouble(textField.getText());
        }
        else if(equationChar == '/'){
            if(Double.parseDouble(textField.getText()) == 0){
                clear();
                return;
            }
            else{
                value = historyValue / Double.parseDouble(textField.getText());
            }
        }

        textField.setText(value + "");

        equationChar = '=';
    }

    public void clearEquationChar(){
        equationChar = ' ';
    }
}
