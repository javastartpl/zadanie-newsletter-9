package app.controller;

import app.FormatterText;
import app.implementationAlgoritm.LowerCaseFormatterImplementation;
import app.implementationAlgoritm.MixedCaseFormatterImplementation;
import app.implementationAlgoritm.UpperCaseFormatterImplementation;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button buttonTransformText;
    public ComboBox comboBoxSelectAction;
    public TextArea textAreaInput;
    public TextArea textAreaOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void transformText() {
        String inputText = textAreaInput.getText();
        selectTransformOption(inputText);
    }

    private void selectTransformOption(String inputText) {
        FormatterText textFormatterContext = new FormatterText();

        switch ((String) comboBoxSelectAction.getValue()) {
            case "To lower case":
                textFormatterContext.setTextFormatter(new LowerCaseFormatterImplementation());
                textAreaOutput.setText(textFormatterContext.setResultInOutputTextArea(inputText));
                break;
            case "To upper case":
                textFormatterContext.setTextFormatter(new UpperCaseFormatterImplementation());
                textAreaOutput.setText(textFormatterContext.setResultInOutputTextArea(inputText));
                break;
            case "To mixed case":
                textFormatterContext.setTextFormatter(new MixedCaseFormatterImplementation());
                textAreaOutput.setText(textFormatterContext.setResultInOutputTextArea(inputText));
                break;
        }
    }
}
