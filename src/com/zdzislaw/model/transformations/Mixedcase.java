package com.zdzislaw.model.transformations;

import com.zdzislaw.model.ITextFormatter;

public class Mixedcase implements ITextFormatter {
    @Override
    public String modifyText(String text) {
        int lenght=text.length();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<lenght;i++){
            if(i%2==0)

                sb.append(Character.toLowerCase(text.charAt(i)));


            else
                sb.append(Character.toUpperCase(text.charAt(i)));
        }
        return sb.toString();
    }
}
