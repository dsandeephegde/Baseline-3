package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptItemTest {

    @Test
    public void shouldHaveZeroTaxForZeroPrice() {
        ReceiptItem receiptItem = new ReceiptItem(1, "book", 0.0, false);
        assertEquals(0.0, receiptItem.salesTax(), 0.0);
    }
}