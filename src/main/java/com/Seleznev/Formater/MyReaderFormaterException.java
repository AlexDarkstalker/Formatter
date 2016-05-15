package com.Seleznev.Formater;

import com.Seleznev.Reader.MyReaderException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class MyReaderFormaterException extends Throwable {
    public MyReaderFormaterException(String s, MyReaderException e) {
        super(s,e);
    }
}
