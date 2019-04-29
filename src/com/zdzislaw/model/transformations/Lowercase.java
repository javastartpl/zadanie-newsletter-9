package com.zdzislaw.model.transformations;

import com.zdzislaw.model.ITextFormatter;

public class Lowercase implements ITextFormatter {

    @Override
    public String modifyText(String text) {
        return text.toLowerCase();
    }
}
