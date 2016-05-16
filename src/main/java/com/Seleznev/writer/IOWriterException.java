package com.Seleznev.writer;

import java.io.IOException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class IOWriterException extends Throwable {
    public IOWriterException(String s, IOException e) {
        super(s,e);
    }
}
