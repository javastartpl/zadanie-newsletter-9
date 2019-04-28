import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.stream.IntStream;

// PoC
public class TextTransformation extends Application {

    //TODO: zaimplementować GUI w FXML (MVC)
    //TODO: zaimplementować wzorzec strategii
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text transformation");

        TextArea textAreaInput = new TextArea();
        TextArea textAreaOutput = new TextArea();

        Button button = new Button("Transform text");
        button.setMinWidth(50);

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().add("toLowerCase");
        comboBox.getItems().add("toUpperCase");
        comboBox.getItems().add("toMixedCase");
        comboBox.getSelectionModel().selectFirst();

        transformText(textAreaInput, textAreaOutput, button, comboBox);

        VBox vbox = new VBox(textAreaInput, comboBox, button, textAreaOutput);

        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void transformText(TextArea textAreaInput, TextArea textAreaOutput, Button button, ComboBox<String> comboBox) {
        button.setOnAction(action -> {
            String inputText = textAreaInput.getText();

            String chooseComboBox = comboBox.getValue();
            switch (chooseComboBox) {
                case "toLowerCase":
                    textAreaOutput.setText(inputText.toLowerCase());
                    break;
                case "toUpperCase":
                    textAreaOutput.setText(inputText.toUpperCase());
                    break;
                case "toMixedCase":
                    textAreaOutput.setText(createMixedCaseText(inputText));
                    break;
            }
        });
    }

    //TODO: poprawić mixed case z wielkich liter (ASCII)
    private String createMixedCaseText(String text) {
        return IntStream.range(0, text.length())
                .mapToObj(i -> i % 2 == 0 ? Character.toUpperCase(text.charAt(i)) : text.charAt(i))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}