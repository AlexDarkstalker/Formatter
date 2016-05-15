package com.Seleznev.Reader.IReader;

import com.Seleznev.Reader.MyReaderException;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public interface IReader {
    char getNext() throws MyReaderException;
    void close() throws MyReaderException;
    boolean hasNext() throws MyReaderException;
}
