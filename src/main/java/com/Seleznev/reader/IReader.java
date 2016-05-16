package com.Seleznev.reader;

import com.Seleznev.reader.MyReaderException;

/**
 * Input interface
 * Created by alxunderseelisnow on 14.05.16.
 */

public interface IReader {
    /**
     *
     * @return next symbol from the stream
     * @throws MyReaderException
     */
    char getNext() throws MyReaderException;

    /**
     *
     * @throws MyReaderException
     */
    void close() throws MyReaderException;

    /**
     *
     * @return true if there are more symbols in the stream
     * @throws MyReaderException
     */
    boolean hasNext() throws MyReaderException;
}
