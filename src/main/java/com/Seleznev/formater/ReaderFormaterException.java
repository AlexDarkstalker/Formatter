package com.Seleznev.formater;

import com.Seleznev.reader.MyReaderException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class ReaderFormaterException extends Throwable {
    public ReaderFormaterException(String s, MyReaderException e) {
        super(s,e);
    }
}
