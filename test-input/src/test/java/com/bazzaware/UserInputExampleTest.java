package com.bazzaware;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class UserInputExampleTest {

    @Test
    public void userInputTestInStreamPrintStream() {
        // arrange

        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n4\n".getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        // act
        UserInputExample userInputExample = new UserInputExample(inputStream, ps);
        userInputExample.start();
        String outputText = byteArrayOutputStream.toString();
        String key = "output:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();

        // assert
        Assert.assertEquals(output, "7");
    }
    @Test
    public void userInputTestSetInSetOut(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("3\n4\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        UserInputExample.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "output:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals(output, "7");
    }
}