package com.Seleznev.writer.implementationWriter;

import com.Seleznev.writer.MyEncodingWriterException;
import com.Seleznev.writer.MyIOWriterException;
import com.Seleznev.writer.IWriter;

import java.io.*;

/**
 * class for output to the string
 * Created by alxunderseelisnow on 14.05.16.
 */
public class StringStreamWriter implements IWriter {
    private Writer stringWriter;
    //private StringBuffer output;


    public StringStreamWriter() throws MyEncodingWriterException {
        try {
            OutputStream stringOutputStream = new ByteArrayOutputStream();
            Writer stringOutputWriter = new OutputStreamWriter(stringOutputStream, "utf-8");
            this.stringWriter = new PrintWriter(System.out);//(stringOutputWriter);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingWriterException("Wrong writer stream encoding", e);
        }
        //this.stringWriter = new StringWriter();
        //this.output = new StringBuffer(output);
    }


    public void write(String outPutPart) throws MyIOWriterException {
        try {
            this.stringWriter.append(outPutPart);
            //this.output.append(outPutPart);
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
