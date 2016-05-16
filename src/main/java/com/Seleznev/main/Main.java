package com.Seleznev.main;

import com.Seleznev.formater.MyIOWriterFormaterException;
import com.Seleznev.formater.MyReaderFormaterException;
import com.Seleznev.Reader.RealisationsReader.FileReader;
import com.Seleznev.Reader.IReader.IReader;
import com.Seleznev.Reader.MyEncodingReaderException;
import com.Seleznev.Reader.MyReaderException;
import com.Seleznev.Reader.MyReaderFileNotFoundException;
import com.Seleznev.Reader.RealisationsReader.MyStringReader;
import com.Seleznev.Writer.RealisationWriter.FileWriter;
import com.Seleznev.Writer.IWriter.IWriter;
import com.Seleznev.Writer.MyEncodingWriterException;
import com.Seleznev.Writer.MyIOWriterException;
import com.Seleznev.Writer.MyWriterException;
import com.Seleznev.Writer.RealisationWriter.StringStreamWriter;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import static com.Seleznev.formater.Formater.format;

/**
 * main class
 * Created by alxunderseelisnow on 15.05.16.
 */

public class Main {
    public static void main(String [] argv) throws FileNotFoundException, UnsupportedEncodingException, MyReaderException, MyEncodingWriterException, MyWriterException, MyIOWriterException, MyEncodingReaderException, MyReaderFileNotFoundException, MyIOWriterFormaterException, MyReaderFormaterException {
        String input = "makefunc(){dosmth;alsosmth;усложним{что-тоделаем;ещенемного}andalsosmth;finish}";
        IReader inString = new MyStringReader(input);
        IWriter outString = new StringStreamWriter();
        IReader in = new FileReader("input.txt");
        IWriter out = new FileWriter("output.txt");
        format(in, out);
        format(inString,outString);
    }
}