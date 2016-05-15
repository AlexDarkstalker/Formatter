package com.Seleznev.Writer.IWriter;

import com.Seleznev.Writer.MyIOWriterException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public interface IWriter {
    void write(String outPutPart) throws MyIOWriterException;
    void close() throws MyIOWriterException;

}
