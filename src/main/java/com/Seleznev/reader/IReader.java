package com.Seleznev.reader;

/**
 * Input interface
 * Created by alxunderseelisnow on 14.05.16.
 */

public interface IReader {
    /**
     *
     * @return next symbol from the stream
     * @throws ReaderException
     */
    char getNext() throws ReaderException;

    /**
     *
     * @throws ReaderException
     */
    void close() throws ReaderException;

    /**
     *
     * @return true if there are more symbols in the stream
     * @throws ReaderException
     */
    boolean hasNext() throws ReaderException;
}
