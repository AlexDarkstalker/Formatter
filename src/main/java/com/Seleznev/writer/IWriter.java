package com.Seleznev.writer;

/**
 * Interface for output streams
 * Created by alxunderseelisnow on 14.05.16.
 */
public interface IWriter {
    /**
     * writes the string in the stream
     * @param outPutPart string to be output
     * @throws IOWriterException
     */
    void write(String outPutPart) throws IOWriterException;

    /**
     * close output stream
     * @throws IOWriterException
     */
    void close() throws IOWriterException;


}
