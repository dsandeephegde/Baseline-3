package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnReceiptItem() {
        Parser parser = new Parser("1 book 20");
        assertEquals(ReceiptItem.class, parser.parse().getClass());
    }
}