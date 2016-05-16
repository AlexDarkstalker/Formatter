package com.Seleznev.reader;

import java.io.IOException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class ReaderException extends Exception {

    public ReaderException(String s, IOException e) {
        super(s, e);
    }
}
