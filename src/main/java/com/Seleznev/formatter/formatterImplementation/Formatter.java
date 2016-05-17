package com.Seleznev.formatter.formatterImplementation;

import com.Seleznev.formatter.FormaterIOWriterException;
import com.Seleznev.formatter.FormaterReaderException;
import com.Seleznev.formatter.IFormatter;
import com.Seleznev.reader.ReaderException;
import com.Seleznev.writer.*;
import com.Seleznev.reader.IReader;
import com.Seleznev.writer.IWriter;

import java.util.Map;

/**
 * Class formatter with method format
 * Created by alxunderseelisnow on 13.05.16.
 */
public class Formatter implements IFormatter {
    private IReader in;
    private IWriter out;
    private Map symbolAction;

    public Formatter(IReader in, IWriter out, final Map symbolAction){
        this.in = in;
        this.out = out;
        this.symbolAction = symbolAction;
    }
    /**
     *formats the string from input stream and puts it to the output stream
     * @throws FormaterReaderException
     * @throws FormaterIOWriterException
     */
    public void format() throws FormaterReaderException, FormaterIOWriterException {
        int count = 0;
        char symbol;
        try {
            while(this.in.hasNext()) {
                symbol = this.in.getNext();
                if (this.symbolAction.containsKey(symbol)) {
                    this.out.write((String) this.symbolAction.get(symbol));
                } else {
                    out.write(String.valueOf(symbol));
                }
            }
        } catch (ReaderException e) {
            throw new FormaterReaderException("In formatter reader can't check next element", e);
        } catch (IOWriterException e) {
            throw new FormaterIOWriterException("In formatter writer can't write", e);
        }

        try {
            this.in.close();
        } catch (ReaderException e) {
            throw new FormaterReaderException("In formatter reader can't close", e);
        }
        try {
            this.out.close();
        } catch (IOWriterException e) {
            throw new FormaterIOWriterException("In formatter writer can't close", e);
        }

    }
}
