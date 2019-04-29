package app.implementationAlgoritm;

import app.interfaces.TextFormatter;

public class UpperCaseFormatterImplementation implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
