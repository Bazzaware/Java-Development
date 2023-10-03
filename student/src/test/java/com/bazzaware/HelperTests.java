package com.bazzaware;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class HelperTests {
    
    @Test
    public void ShouldPass(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("3\n4\n".getBytes()));

        ByteArrayOutputStream ByteArrayOutputStream = new ByteArrayOutputStream;
        PrintStream printStream = new PrintStream(ByteArrayOutputStream);
        PrintStream stdOut = System.out;
        System.setOut(printStream);


    }


}
