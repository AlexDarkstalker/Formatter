package com.Seleznev.reader;

import java.io.UnsupportedEncodingException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class EncodingReaderException extends Throwable {
    public EncodingReaderException(String s, UnsupportedEncodingException e) {
        super(s,e);
    }
}
