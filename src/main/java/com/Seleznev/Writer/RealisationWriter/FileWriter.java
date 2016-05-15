package com.Seleznev.Writer.RealisationWriter;

import com.Seleznev.Writer.IWriter.IWriter;
import com.Seleznev.Writer.MyEncodingWriterException;
import com.Seleznev.Writer.MyIOWriterException;
import com.Seleznev.Writer.MyWriterException;

import java.io.*;

/**
 * Created by alxunderseelisnow on 14.05.16.
 */
public class FileWriter implements IWriter {
    Writer printWriter;


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

    public void write(String outPutPart) throws MyIOWriterException {
        try {
            this.printWriter.append(outPutPart);
        } catch (IOException e) {
            throw new MyIOWriterException("File writer error in write", e);
        }
    }

    public void close() throws MyIOWriterException {
        try {
            this.printWriter.close();
        } catch (IOException e) {
            throw new MyIOWriterException("File writer closing error", e);
        }
    }

}
