package com.Seleznev.Writer.RealisationWriter;

import com.Seleznev.Writer.MyEncodingWriterException;
import com.Seleznev.Writer.MyIOWriterException;
import com.Seleznev.Writer.IWriter.IWriter;

import java.io.*;

/**
 * class for output to the string
 * Created by alxunderseelisnow on 14.05.16.
 */
public class MyStringWriter implements IWriter {
    private Writer stringWriter;
    private StringBuffer output;
    public MyStringWriter(String output) throws MyEncodingWriterException {
        this.stringWriter = new StringWriter();
        this.output = new StringBuffer(output);
    }


    public void write(String outPutPart) throws MyIOWriterException {
        try {
            this.stringWriter.append(outPutPart);
            this.output.append(outPutPart);
        } catch (IOException e) {
            throw new MyIOWriterException("String writer can't write", e);
        }
    }

    public void close() throws MyIOWriterException {
        try {
            this.stringWriter.close();
        } catch (IOException e) {
            throw new MyIOWriterException("Error closing string writer", e);
        }
    }
}
