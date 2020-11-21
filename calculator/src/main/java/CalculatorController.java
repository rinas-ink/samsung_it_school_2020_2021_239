import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class CalculatorController {

    public TextField text;
    private int x;
    private String operation;

    public void inputDigit(ActionEvent actionEvent) {
        String digit = ((Button) actionEvent.getSource()).getText();
        text.setText(text.getText() + digit);
    }

    public void removeLastDigit(ActionEvent actionEvent) {
        text.setText(text.getText(0, text.getLength() - 1));
    }

    public void inputKey(KeyEvent keyEvent) {
        String key = keyEvent.getText();
        switch (key) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                text.setText(text.getText() + key);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                x = Integer.parseInt(text.getText());
                text.setText("");
                this.operation = key;
                break;
        }
        if (keyEvent.getCode().toString().equals("ENTER")) {
            processEnter();
        }
    }

    private void processEnter() {
        switch (operation) {
            case "+":
                x = x + Integer.parseInt(text.getText());
                text.setText(String.valueOf(x));
                operation = "";
                break;
            case "-":
                x = x - Integer.parseInt(text.getText());
                text.setText(String.valueOf(x));
                operation = "";
                break;
            case "*":
                x = x * Integer.parseInt(text.getText());
                text.setText(String.valueOf(x));
                operation = "";
                break;
            case "/":
                x = x / Integer.parseInt(text.getText());
                text.setText(String.valueOf(x));
                operation = "";
        }
    }

    private String processLength(String text) {
        // TODO: 21.11.2020 1000000000 -> 1 000 000 0000
        return null;
    }

    public void calculate(ActionEvent actionEvent) {
        String operation = ((Button) actionEvent.getSource()).getText();
        x = Integer.parseInt(text.getText());
        text.setText("");
        this.operation = operation;
    }

    public void enter(ActionEvent actionEvent) {
        processEnter();
    }
}
