package com.zdzislaw.model.transformations;

import com.zdzislaw.model.ITextFormatter;

public class Uppercase implements ITextFormatter {

    @Override
    public String modifyText(String text) {
        return text.toUpperCase();
    }
}
