package app;

import app.interfaces.TextFormatter;

public class FormatterText {
    private TextFormatter textFormatter;

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String setResultInOutputTextArea(String text) {
        return textFormatter.formatText(text);
    }
}
