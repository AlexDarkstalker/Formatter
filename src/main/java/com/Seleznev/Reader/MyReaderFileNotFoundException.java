package com.Seleznev.Reader;

import java.io.FileNotFoundException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class MyReaderFileNotFoundException extends Throwable {
    public MyReaderFileNotFoundException(String s, FileNotFoundException e) {
        super(s,e);
    }
}
