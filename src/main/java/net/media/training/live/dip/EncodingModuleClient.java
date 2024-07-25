package net.media.training.live.dip;

import jdk.nashorn.api.scripting.URLReader;

import java.io.*;
import java.net.URL;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule fileEncodingModule = new EncodingModule(new BufferedReader(new FileReader("filepath")), new BufferedWriter(new FileWriter("filePath")), Base64.getEncoder());
        fileEncodingModule.encodeAndWrite();
        EncodingModule urlEncodingModule = new EncodingModule(new URLReader(new URL("url")), new DatabaseWriter(new MyDatabase()), Base64.getEncoder());
        urlEncodingModule.encodeAndWrite();
    }
}
