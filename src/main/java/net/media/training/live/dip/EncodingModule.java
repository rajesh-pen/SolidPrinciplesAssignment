package net.media.training.live.dip;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {

    private Reader reader;
    private Writer writer;
    private Base64.Encoder encoder;

    public EncodingModule(Reader reader, Writer writer, Base64.Encoder encoder) {
        this.reader = reader;
        this.writer = writer;
        this.encoder = encoder;
    }

    public void encodeAndWrite(){
        //reads using Reader, encodes using Encoder and writes using writer
    }
}

