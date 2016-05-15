package com.Seleznev.Writer;

import java.io.IOException;

/**
 * Created by alxunderseelisnow on 15.05.16.
 */
public class MyIOWriterException extends Throwable {
    public MyIOWriterException(String s, IOException e) {
        super(s,e);
    }
}
