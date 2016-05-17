package com.Seleznev.writer.implementationWriter;

import com.Seleznev.writer.IWriter;
import com.Seleznev.writer.EncodingWriterException;
import com.Seleznev.writer.IOWriterException;
import com.Seleznev.writer.WriterException;

import java.io.*;

/**
 * Class implementation of output in the file
 * Created by alxunderseelisnow on 14.05.16.
 */
public class FileWriter implements IWriter {
    private Writer printWriter;


    /**
     * constructor
     * @param fileName title of the file for the output
     * @throws WriterException
     * @throws EncodingWriterException
     */
    public FileWriter(String fileName) throws WriterException, EncodingWriterException {
        try {
            OutputStream fileStream = new FileOutputStream(new File(fileName));
            Writer fileWriter = new OutputStreamWriter(fileStream, "utf-8");
            this.printWriter = new PrintWriter(fileWriter);
        } catch (FileNotFoundException e) {
            throw new WriterException("Output file not found", e);
        } catch (UnsupportedEncodingException e) {
            throw new EncodingWriterException("Wrong encoding", e);
        }
    }

    /**
     * puts the string to be output in the file output stream
     * @param outPutPart string to be output
     * @throws IOWriterException
     */
    public void write(String outPutPart) throws IOWriterException {
        try {
            this.printWriter.append(outPutPart);
        } catch (IOException e) {
            throw new IOWriterException("File writer error in write", e);
        }
    }

    /**
     * closes file output stream
     * @throws IOWriterException
     */
    public void close() throws IOWriterException {
        try {
            this.printWriter.close();
        } catch (IOException e) {
            throw new IOWriterException("File writer closing error", e);
        }
    }

}
