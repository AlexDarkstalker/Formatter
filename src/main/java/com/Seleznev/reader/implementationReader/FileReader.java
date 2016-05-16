package com.Seleznev.reader.implementationReader;

import com.Seleznev.reader.IReader;
import com.Seleznev.reader.MyEncodingReaderException;
import com.Seleznev.reader.MyReaderException;
import com.Seleznev.reader.MyReaderFileNotFoundException;

import java.io.*;

/**
 * Class filereader realising FileStream
 * Created by alxunderseelisnow on 14.05.16.
 */

public class FileReader implements IReader {
    private Reader reader;

    /**
     *
     * @param fileName contains name of file for input stream
     * @throws MyReaderFileNotFoundException
     * @throws MyEncodingReaderException
     */
    public FileReader(String fileName) throws MyReaderFileNotFoundException, MyEncodingReaderException {
        try {
            InputStream fileStream = new FileInputStream(new File(fileName));
            Reader fileReader = new InputStreamReader(fileStream, "utf-8");
            this.reader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new MyReaderFileNotFoundException("reader can't open file", e);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingReaderException("File reader wrong encoding", e);
        }


    }

    /**
     * method to get next element from stream
     * @return next element from file input stream
     * @throws MyReaderException
     */
    public char getNext() throws MyReaderException {
        try {
            return (char) this.reader.read();
        } catch (IOException e) {
            throw new MyReaderException("Error reading", e);
        }
    }

    /**
     * method to close the stream
     * @throws MyReaderException
     */
    public void close() throws MyReaderException {
        try {
            this.reader.close();
        } catch (IOException e) {
            throw new MyReaderException("Error closing", e);
        }
    }

    /**
     * check if there are more elements in the stream
     * @return true if there are any elements in file input stream
     * @throws MyReaderException
     */
    public boolean hasNext() throws MyReaderException {
        try {
            return this.reader.ready();
        } catch (IOException e) {
            throw new MyReaderException("Error checking next", e);
        }

    }
}
