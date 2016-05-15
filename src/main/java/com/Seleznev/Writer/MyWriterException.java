package com.Seleznev.Writer;

import java.io.FileNotFoundException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class MyWriterException extends Throwable {
    public MyWriterException(String s, FileNotFoundException e) {
        super(s,e);
    }
}
