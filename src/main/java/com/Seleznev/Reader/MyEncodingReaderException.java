package com.Seleznev.Reader;

import java.io.UnsupportedEncodingException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class MyEncodingReaderException extends Throwable {
    public MyEncodingReaderException(String s, UnsupportedEncodingException e) {
        super(s,e);
    }
}
