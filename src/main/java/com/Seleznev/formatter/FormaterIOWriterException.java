package com.Seleznev.formatter;

import com.Seleznev.writer.IOWriterException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class FormaterIOWriterException extends Throwable {
    public FormaterIOWriterException(String s, IOWriterException e) {
        super(s,e);
    }
}
