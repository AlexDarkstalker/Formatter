package com.Seleznev.formatter;

import com.Seleznev.reader.ReaderException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class FormaterReaderException extends Throwable {
    public FormaterReaderException(String s, ReaderException e) {
        super(s,e);
    }
}
