package app.implementationAlgoritm;

import app.interfaces.TextFormatter;

public class LowerCaseFormatterImplementation implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
