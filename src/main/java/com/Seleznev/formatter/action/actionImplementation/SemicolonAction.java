package com.Seleznev.formatter.action.actionImplementation;

import com.Seleznev.formatter.action.IAction;
import com.Seleznev.formatter.formatterImplementation.FormatterState;

/**
 * Created by alxunderseelisnow on 23.05.16.
 */
public class SemicolonAction implements IAction {
    //private FormatterState state;

    public String actFormat(FormatterState state) {
        StringBuilder output = new StringBuilder();
        output.append(";\n");
        for(int i = 0; i < state.getCount(); i++)
            output.append("    ");
        return output.toString();
    }
}
