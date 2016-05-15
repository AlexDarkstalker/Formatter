package com.Seleznev.Reader.RealisationsReader;

import com.Seleznev.Reader.MyEncodingReaderException;
import com.Seleznev.Reader.MyReaderException;
import com.Seleznev.Reader.IReader.IReader;

import java.io.*;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class MyStringReader implements IReader {
    Reader stringReader;

    public MyStringReader(String input) throws MyEncodingReaderException {

        try {
            InputStream stringStream = new ByteArrayInputStream(input.getBytes("utf-8"));
            Reader reader = new InputStreamReader(stringStream, "utf-8");
            this.stringReader = new BufferedReader(reader);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingReaderException("Wrong encoding at string", e);
        }

    }
    public char getNext() throws MyReaderException {
        try {
            return (char) this.stringReader.read();
        } catch (IOException e) {
            throw new MyReaderException("Can't get next from string", e);
        }
    }

    public void close() throws MyReaderException {
        try {
            this.stringReader.close();
        } catch (IOException e) {
            throw new MyReaderException("Can't close string reader stream", e);
        }
    }

    public boolean hasNext() throws MyReaderException {
        try {
            return this.stringReader.ready();
        } catch (IOException e) {
            throw new MyReaderException("Can't check next in string", e);
        }
    }
}
