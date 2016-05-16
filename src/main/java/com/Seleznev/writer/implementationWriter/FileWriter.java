package com.Seleznev.writer.implementationWriter;

import com.Seleznev.writer.IWriter;
import com.Seleznev.writer.MyEncodingWriterException;
import com.Seleznev.writer.MyIOWriterException;
import com.Seleznev.writer.MyWriterException;

import java.io.*;

/**
 * Class realisation of output in the file
 * Created by alxunderseelisnow on 14.05.16.
 */
public class FileWriter implements IWriter {
    private Writer printWriter;


    /**
     * constructor
     * @param fileName title of the file for the output
     * @throws MyWriterException
     * @throws MyEncodingWriterException
     */
    public FileWriter(String fileName) throws MyWriterException, MyEncodingWriterException {
        try {
            OutputStream fileStream = new FileOutputStream(new File(fileName));
            Writer fileWriter = new OutputStreamWriter(fileStream, "utf-8");
            this.printWriter = new PrintWriter(fileWriter);
        } catch (FileNotFoundException e) {
            throw new MyWriterException("Output file not found", e);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingWriterException("Wrong encoding", e);
        }
    }

    /**
     * puts the string to be output in the file output stream
     * @param outPutPart string to be output
     * @throws MyIOWriterException
     */
    public void write(String outPutPart) throws MyIOWriterException {
        try {
            this.printWriter.append(outPutPart);
        } catch (IOException e) {
            throw new MyIOWriterException("File writer error in write", e);
        }
    }

    /**
     * closes file output stream
     * @throws MyIOWriterException
     */
    public void close() throws MyIOWriterException {
        try {
            this.printWriter.close();
        } catch (IOException e) {
            throw new MyIOWriterException("File writer closing error", e);
        }
    }

}
