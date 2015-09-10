package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptItemTest {

    @Test
    public void shouldHaveZeroTaxForZeroPrice() {
        ReceiptItem receiptItem = new ReceiptItem(1, "book", 0.0, false);
        assertEquals(0.0, receiptItem.salesTax(), 0.0);
    }

    @Test
    public void shouldHaveTenPercentTaxForAllGoods() {
        ReceiptItem receiptItem = new ReceiptItem(1, "CD", 10.0, false);
        assertEquals(1.0, receiptItem.salesTax(), 0.0);
    }

    @Test
    public void shouldHaveFivePercentExtraForImported() {
        ReceiptItem receiptItem = new ReceiptItem(1, "CD", 10.0, true);
        assertEquals(1.5, receiptItem.salesTax(), 0.0);
    }

    @Test
    public void shouldHaveZeroTaxForExceptionsInGoods() {
        ReceiptItem receiptItem = new ReceiptItem(1, "book", 10.0, false);
        assertEquals(0.0, receiptItem.salesTax(), 0.0);
    }
}