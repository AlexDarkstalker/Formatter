package com.Seleznev.reader.implementationReader;

import com.Seleznev.reader.MyEncodingReaderException;
import com.Seleznev.reader.MyReaderException;
import com.Seleznev.reader.IReader;

import java.io.*;

/**
 * class for string input stream
 * Created by alxunderseelisnow on 14.05.16.
 */
public class StringStreamReader implements IReader {
    private Reader stringReader;

    /**
     * constructor
     * @param input title of the string for string input
     * @throws MyEncodingReaderException
     */
    public StringStreamReader(String input) throws MyEncodingReaderException {

        try {
            InputStream stringStream = new ByteArrayInputStream(input.getBytes("utf-8"));
            Reader reader = new InputStreamReader(stringStream, "utf-8");
            this.stringReader = new BufferedReader(reader);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingReaderException("Wrong encoding at string", e);
        }

    }

    /**
     * gets elem from string to the stream
     * @return current element from the string stream
     * @throws MyReaderException
     */
    public char getNext() throws MyReaderException {
        try {
            return (char) this.stringReader.read();
        } catch (IOException e) {
            throw new MyReaderException("Can't get next from string", e);
        }
    }

    /**
     * close the stream
     * @throws MyReaderException
     */
    public void close() throws MyReaderException {
        try {
            this.stringReader.close();
        } catch (IOException e) {
            throw new MyReaderException("Can't close string reader stream", e);
        }
    }

    /**
     * check if there are any more elements in the stream
     * @return true if there are elements in the string input stream
     * @throws MyReaderException
     */
    public boolean hasNext() throws MyReaderException {
        try {
            return this.stringReader.ready();
        } catch (IOException e) {
            throw new MyReaderException("Can't check next in string", e);
        }
    }
}
