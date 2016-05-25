package com.Seleznev.main;

import com.Seleznev.formatter.FormaterIOWriterException;
import com.Seleznev.formatter.FormaterReaderException;
import com.Seleznev.formatter.IFormatter;
import com.Seleznev.formatter.action.IAction;
import com.Seleznev.formatter.action.actionImplementation.ClosingBraceAction;
import com.Seleznev.formatter.action.actionImplementation.InitialBraceAction;
import com.Seleznev.formatter.action.actionImplementation.SemicolonAction;
import com.Seleznev.formatter.formatterImplementation.Formatter;
import com.Seleznev.reader.implementationReader.FileReader;
import com.Seleznev.reader.IReader;
import com.Seleznev.reader.EncodingReaderException;
import com.Seleznev.reader.ReaderFileNotFoundException;
import com.Seleznev.reader.implementationReader.StringStreamReader;
import com.Seleznev.writer.implementationWriter.FileWriter;
import com.Seleznev.writer.IWriter;
import com.Seleznev.writer.EncodingWriterException;
import com.Seleznev.writer.WriterException;
import com.Seleznev.writer.implementationWriter.StringStreamWriter;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * main class
 * Created by alxunderseelisnow on 15.05.16.
 */

public class Main {
    public static void main(String [] argv) throws MainException {
        IAction close = new ClosingBraceAction();
        IAction open = new InitialBraceAction();
        IAction semicolon = new SemicolonAction();
        Map<Character, IAction> symbolAction = new HashMap<Character, IAction>();
        symbolAction.put('{', open);
        symbolAction.put('}', close);
        symbolAction.put(';', semicolon);
        String input = "makefunc(){dosmth;alsosmth;усложним{что-тоделаем;ещенемного}andalsosmth;finish;}";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        IReader inString = null;
        try {
            inString = new StringStreamReader(input);
            IWriter outString = new StringStreamWriter(output);
            IReader in = new FileReader("input.txt");
            IWriter out = new FileWriter("output.txt");
            IFormatter iformat = new Formatter(in, out, symbolAction);
            iformat.format();
            iformat = new Formatter(inString,outString, symbolAction);
            iformat.format();
        } catch (EncodingReaderException e) {
            throw new MainException("Main error encoding reader", e);
        } catch (FormaterIOWriterException e) {
            throw new MainException("Main error IOWriting exception", e);
        } catch (WriterException e) {
            throw new MainException("Main error writer exception", e);
        } catch (FormaterReaderException e) {
            throw new MainException("Main error formatter reading exception", e);
        } catch (ReaderFileNotFoundException e) {
            throw new MainException("Main error file not found", e);
        } catch (EncodingWriterException e) {
            throw new MainException("Main error encoding writer", e);
        }
        System.out.print(new String(output.toByteArray()));
    }
}
