package com.Seleznev.formatter.formatterImplementation;

/**
 * State of formatter
 * Created by alxunderseelisnow on 23.05.16.
 */
public class FormatterState {
    public FormatterState(){
        this.count = 0;
    }

    private int count;

    public int getCount()
    {
        return this.count;
    }

    public void incCount() {
        ++this.count;
    }

    public void decCount() {
        --this.count;
    }
}
