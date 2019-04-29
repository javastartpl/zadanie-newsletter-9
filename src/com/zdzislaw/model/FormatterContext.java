package com.zdzislaw.model;

import com.zdzislaw.model.transformations.Lowercase;
import com.zdzislaw.model.transformations.Mixedcase;
import com.zdzislaw.model.transformations.Uppercase;

public class FormatterContext {
    private ITextFormatter textFormatter = null;

    public FormatterContext(String modifyType) {
        if (modifyType.equals("lowercase")) {
            textFormatter = new Lowercase();
        } else if (modifyType.equals("uppercase")) {
            textFormatter = new Uppercase();
        } else if (modifyType.equals("mixedcase")) {
            textFormatter = new Mixedcase();
        }
    }

    public String transformText(String sourceText) {


        String newText = textFormatter.modifyText(sourceText);

        System.out.println("zly argument");

        return newText;
    }
}

