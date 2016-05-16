package com.Seleznev.writer;

import com.Seleznev.writer.MyIOWriterException;

/**
 * Interface for output streams
 * Created by alxunderseelisnow on 14.05.16.
 */
public interface IWriter {
    /**
     * writes the string in the stream
     * @param outPutPart string to be output
     * @throws MyIOWriterException
     */
    void write(String outPutPart) throws MyIOWriterException;

    /**
     * close output stream
     * @throws MyIOWriterException
     */
    void close() throws MyIOWriterException;

}
