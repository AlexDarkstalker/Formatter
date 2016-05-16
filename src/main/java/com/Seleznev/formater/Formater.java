package com.Seleznev.formater;

import com.Seleznev.Reader.MyReaderException;
import com.Seleznev.Writer.*;
import com.Seleznev.Reader.IReader.IReader;
import com.Seleznev.Writer.IWriter.IWriter;

/**
 * Class formater with method format
 * Created by alxunderseelisnow on 13.05.16.
 */
public class Formater {
    /**
     *
     * @param in input stream
     * @param out output stream
     * @throws MyReaderFormaterException
     * @throws MyIOWriterFormaterException
     */
    public static void format(IReader in, IWriter out) throws MyReaderFormaterException, MyIOWriterFormaterException {
        int count = 0;
        char symbol;
        String spaces = "    ";
        String enter = "\n";
        try {
            while(in.hasNext())
                switch(symbol = in.getNext())
                {
                    case '{':
                        count++;
                        out.write(Character.toString(symbol));
                        out.write(enter);
                        for(int j = 0; j < count; j++)
                            out.write(spaces);
                        break;
                    case ';':
                        out.write(Character.toString(symbol));
                        out.write(enter);
                        for(int j = 0; j < count; j++)
                            out.write(spaces);
                        break;
                    case '}':
                        count--;
                        out.write(enter);
                        for(int j = 0; j < count; j++)
                            out.write(spaces);
                        out.write(Character.toString(symbol));
                        out.write(enter);
                        break;
                    default:
                        out.write(Character.toString(symbol));
                        break;
                }
        } catch (MyReaderException e) {
            throw new MyReaderFormaterException("In formatter reader can't check next element", e);
        } catch (MyIOWriterException e) {
            throw new MyIOWriterFormaterException("In formatter writer can't write", e);
        }

        try {
            in.close();
        } catch (MyReaderException e) {
            throw new MyReaderFormaterException("In formatter reader can't close", e);
        }
        try {
            out.close();
        } catch (MyIOWriterException e) {
            throw new MyIOWriterFormaterException("In formatter writer can't close", e);
        }

    }
}