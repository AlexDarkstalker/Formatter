package com.Seleznev.Formater;

import com.Seleznev.Writer.MyIOWriterException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class MyIOWriterFormaterException extends Throwable {
    public MyIOWriterFormaterException(String s, MyIOWriterException e) {
        super(s,e);
    }
}
