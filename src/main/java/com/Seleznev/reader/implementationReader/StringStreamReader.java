package com.Seleznev.reader.implementationReader;

import com.Seleznev.reader.EncodingReaderException;
import com.Seleznev.reader.ReaderException;
import com.Seleznev.reader.IReader;

import java.io.*;

/**
 * class implements string input stream
 * Created by alxunderseelisnow on 14.05.16.
 */
public class StringStreamReader implements IReader {
    private Reader stringReader;

    /**
     * constructor
     * @param input title of the string for string input
     * @throws EncodingReaderException
     */
    public StringStreamReader(String input) throws EncodingReaderException {

        try {
            InputStream stringStream = new ByteArrayInputStream(input.getBytes("utf-8"));
            Reader reader = new InputStreamReader(stringStream, "utf-8");
            this.stringReader = new BufferedReader(reader);
        } catch (UnsupportedEncodingException e) {
            throw new EncodingReaderException("Wrong encoding at string", e);
        }

    }

    /**
     * gets elem from string to the stream
     * @return current element from the string stream
     * @throws ReaderException
     */
    public char getNext() throws ReaderException {
        try {
            return (char) this.stringReader.read();
        } catch (IOException e) {
            throw new ReaderException("Can't get next from string", e);
        }
    }

    /**
     * close the stream
     * @throws ReaderException
     */
    public void close() throws ReaderException {
        try {
            this.stringReader.close();
        } catch (IOException e) {
            throw new ReaderException("Can't close string reader stream", e);
        }
    }

    /**
     * check if there are any more elements in the stream
     * @return true if there are elements in the string input stream
     * @throws ReaderException
     */
    public boolean hasNext() throws ReaderException {
        try {
            return this.stringReader.ready();
        } catch (IOException e) {
            throw new ReaderException("Can't check next in string", e);
        }
    }
}
