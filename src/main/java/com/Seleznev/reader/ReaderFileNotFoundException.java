package com.Seleznev.reader;

import java.io.FileNotFoundException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class ReaderFileNotFoundException extends Throwable {
    public ReaderFileNotFoundException(String s, FileNotFoundException e) {
        super(s,e);
    }
}
