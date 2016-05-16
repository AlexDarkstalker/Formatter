package com.Seleznev.writer;

import java.io.UnsupportedEncodingException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class EncodingWriterException extends Throwable {
    public EncodingWriterException(String s, UnsupportedEncodingException e) {
        super(s,e);
    }
}
