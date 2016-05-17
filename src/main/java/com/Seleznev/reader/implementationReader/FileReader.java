package com.Seleznev.reader.implementationReader;

import com.Seleznev.reader.IReader;
import com.Seleznev.reader.EncodingReaderException;
import com.Seleznev.reader.ReaderException;
import com.Seleznev.reader.ReaderFileNotFoundException;

import java.io.*;

/**
 * Class filereader implements input stream from file
 * Created by alxunderseelisnow on 14.05.16.
 */

public class FileReader implements IReader {
    private Reader reader;

    /**
     *constructor
     * @param fileName contains name of file for input stream
     * @throws ReaderFileNotFoundException
     * @throws EncodingReaderException
     */
    public FileReader(String fileName) throws ReaderFileNotFoundException, EncodingReaderException {
        try {
            InputStream fileStream = new FileInputStream(new File(fileName));
            Reader fileReader = new InputStreamReader(fileStream, "utf-8");
            this.reader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new ReaderFileNotFoundException("reader can't open file", e);
        } catch (UnsupportedEncodingException e) {
            throw new EncodingReaderException("File reader wrong encoding", e);
        }


    }

    /**
     * method to get next element from stream
     * @return next element from file input stream
     * @throws ReaderException
     */
    public char getNext() throws ReaderException {
        try {
            return (char) this.reader.read();
        } catch (IOException e) {
            throw new ReaderException("Error reading", e);
        }
    }

    /**
     * method to close the stream
     * @throws ReaderException
     */
    public void close() throws ReaderException {
        try {
            this.reader.close();
        } catch (IOException e) {
            throw new ReaderException("Error closing", e);
        }
    }

    /**
     * check if there are more elements in the stream
     * @return true if there are any elements in file input stream
     * @throws ReaderException
     */
    public boolean hasNext() throws ReaderException {
        try {
            return this.reader.ready();
        } catch (IOException e) {
            throw new ReaderException("Error checking next", e);
        }

    }
}
