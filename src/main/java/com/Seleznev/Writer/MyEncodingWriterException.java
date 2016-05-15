package com.Seleznev.Writer;

import java.io.UnsupportedEncodingException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class MyEncodingWriterException extends Throwable {
    public MyEncodingWriterException(String s, UnsupportedEncodingException e) {
        super(s,e);
    }
}
