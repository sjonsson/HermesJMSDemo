package com.sjonsson.hermes;

import biz.source_code.base64Coder.Base64Coder;
import java.io.*;

/**
 * Class used to create an instance of HermesDemo class, serialize it and write 
 * it out as a Base64 string.
 * 
 * @author Stan Jonsson
 */
public class SerializeHermesDemoClass {
    

    public static void main(String[] args) throws IOException {
        HermesDemo hermesDemo = new HermesDemo();
        hermesDemo.setFoo("Hermes");
        hermesDemo.setBar("Rocks");
        String string = toBase64String(hermesDemo);
        System.out.println("Base64 encoded serialized version:");
        System.out.println(string);
    }
    
    private static String toBase64String(Serializable o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
        }
        return new String(Base64Coder.encode(baos.toByteArray()));
    }    
}
