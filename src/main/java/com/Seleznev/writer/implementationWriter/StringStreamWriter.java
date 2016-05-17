package com.Seleznev.writer.implementationWriter;

import com.Seleznev.writer.EncodingWriterException;
import com.Seleznev.writer.IOWriterException;
import com.Seleznev.writer.IWriter;

import java.io.*;

/**
 * class implements string output
 * Created by alxunderseelisnow on 14.05.16.
 */
public class StringStreamWriter implements IWriter {
    private Writer stringWriter;
    private ByteArrayOutputStream stringOutputStream;
    private String output;

    /**
     * constructor
     * @throws EncodingWriterException
     */
    public StringStreamWriter(ByteArrayOutputStream output) throws EncodingWriterException {
        try {
            this.stringOutputStream = output;
            Writer stringOutputWriter = new OutputStreamWriter(stringOutputStream, "utf-8");
            this.stringWriter = new PrintWriter(stringOutputWriter);
            //this.output = output;
        } catch (UnsupportedEncodingException e) {
            throw new EncodingWriterException("Wrong writer stream encoding", e);
        }
    }


    /**
     * writes the part of output to the stream
     * @param outPutPart string to be output
     * @throws IOWriterException
     */
    public void write(String outPutPart) throws IOWriterException {
        try {
            this.stringWriter.write(outPutPart);
            //this.output = returnString();
        } catch (IOException e) {
            throw new IOWriterException("String writer can't write", e);
        }
    }

    private String returnString() {
        return new String(this.stringOutputStream.toByteArray());
    }
    /**
     * closes outut stream
     * @throws IOWriterException
     */
    public void close() throws IOWriterException {
        try {
            this.stringWriter.close();
        } catch (IOException e) {
            throw new IOWriterException("Error closing string writer", e);
        }
    }
}
