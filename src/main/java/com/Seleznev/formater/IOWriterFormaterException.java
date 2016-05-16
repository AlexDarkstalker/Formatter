package com.Seleznev.formater;

import com.Seleznev.Writer.MyIOWriterException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class IOWriterFormaterException extends Throwable {
    public IOWriterFormaterException(String s, MyIOWriterException e) {
        super(s,e);
    }
}
