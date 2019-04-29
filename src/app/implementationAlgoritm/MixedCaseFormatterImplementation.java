package app.implementationAlgoritm;

import app.interfaces.TextFormatter;

public class MixedCaseFormatterImplementation implements TextFormatter {
    @Override
    public String formatText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0)
                sb.append(Character.toLowerCase(text.charAt(i)));
            else
                sb.append(Character.toUpperCase(text.charAt(i)));
        }
        return sb.toString();
    }
}
