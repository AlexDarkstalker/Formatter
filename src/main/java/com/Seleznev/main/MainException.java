package com.Seleznev.main;

import com.Seleznev.formatter.FormaterIOWriterException;
import com.Seleznev.formatter.FormaterReaderException;
import com.Seleznev.reader.EncodingReaderException;
import com.Seleznev.reader.ReaderFileNotFoundException;
import com.Seleznev.writer.EncodingWriterException;
import com.Seleznev.writer.WriterException;

/**
 * Exception for errors in main class
 * Created by alxunderseelisnow on 17.05.16.
 */
class MainException extends Throwable {
    MainException(String s, EncodingReaderException e) {
        super(s,e);
    }

    MainException(String s, FormaterIOWriterException e) {
        super(s,e);
    }

    MainException(String s, WriterException e) {
        super(s,e);
    }

    MainException(String s, FormaterReaderException e) {
        super(s,e);
    }

    MainException(String s, ReaderFileNotFoundException e) {
        super(s,e);
    }


    MainException(String s, EncodingWriterException e) {
        super(s,e);
    }
}
