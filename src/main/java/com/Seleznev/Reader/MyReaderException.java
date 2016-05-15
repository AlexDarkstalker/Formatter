package com.Seleznev.Reader;

import java.io.IOException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class MyReaderException extends Exception {

    public MyReaderException(String s, IOException e) {
        super(s, e);
    }
}
