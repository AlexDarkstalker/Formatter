package com.Seleznev.Reader.RealisationsReader;

import com.Seleznev.Reader.IReader.IReader;
import com.Seleznev.Reader.MyEncodingReaderException;
import com.Seleznev.Reader.MyReaderException;
import com.Seleznev.Reader.MyReaderFileNotFoundException;

import java.io.*;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class FileReader implements IReader {
    Reader reader;

    public FileReader(String fileName) throws MyReaderFileNotFoundException, MyEncodingReaderException {
        try {
            InputStream fileStream = new FileInputStream(new File(fileName));
            Reader fileReader = new InputStreamReader(fileStream, "utf-8");
            this.reader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new MyReaderFileNotFoundException("Reader can't open file", e);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingReaderException("File reader wrong encoding", e);
        }


    }
    public char getNext() throws MyReaderException {
        try {
            return (char) this.reader.read();
        } catch (IOException e) {
            throw new MyReaderException("Error reading", e);
        }
    }

    public void close() throws MyReaderException {
        try {
            this.reader.close();
        } catch (IOException e) {
            throw new MyReaderException("Error closing", e);
        }
    }

    public boolean hasNext() throws MyReaderException {
        try {
            return this.reader.ready();
        } catch (IOException e) {
            throw new MyReaderException("Error checking next", e);
        }

    }
}
