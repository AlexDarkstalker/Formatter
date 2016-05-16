package com.Seleznev.writer;

import java.io.FileNotFoundException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class WriterException extends Throwable {
    public WriterException(String s, FileNotFoundException e) {
        super(s,e);
    }
}
