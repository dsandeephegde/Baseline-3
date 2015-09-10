package com.thoughtworks.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ViewTest {

    @Test
    public void shouldGetInputFromConsole() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        View view = new View(scanner, new PrintStream(System.out));
        assertEquals("1", view.input());
        System.setIn(System.in);
    }
}