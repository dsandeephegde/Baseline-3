package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReceiptTest {

    @Test
    public void shouldReturnZeroIfNothingInReceipt() {
        ArrayList<ReceiptItem> receiptItems = new ArrayList<ReceiptItem>();
        Receipt receipt= new Receipt(receiptItems);
        assertEquals(0.0, receipt.salesTax(), 0.001);
    }
}