package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReceiptTest {

    @Test
    public void shouldReturnZeroIfNothingInReceipt() {
        ArrayList<ReceiptItem> receiptItems = new ArrayList<ReceiptItem>();
        Receipt receipt= new Receipt(receiptItems);
        assertEquals(0.0, receipt.totalSalesTax(), 0.001);
    }

    @Test
    public void shouldReturnTotalSalesTax() {
        ArrayList<ReceiptItem> receiptItems = new ArrayList<ReceiptItem>();
        ReceiptItem receiptItem1 = mock(ReceiptItem.class);
        ReceiptItem receiptItem2 = mock(ReceiptItem.class);
        when(receiptItem1.salesTax()).thenReturn(1.0);
        when(receiptItem2.salesTax()).thenReturn(2.0);
        receiptItems.add(receiptItem1);
        receiptItems.add(receiptItem2);
        Receipt receipt= new Receipt(receiptItems);

        assertEquals(3.0, receipt.totalSalesTax(), 0.001);
    }

    @Test
    public void shouldReturnTotalPrice() {
        ArrayList<ReceiptItem> receiptItems = new ArrayList<ReceiptItem>();
        ReceiptItem receiptItem1 = mock(ReceiptItem.class);
        ReceiptItem receiptItem2 = mock(ReceiptItem.class);
        when(receiptItem1.price()).thenReturn(11.0);
        when(receiptItem2.price()).thenReturn(11.5);
        receiptItems.add(receiptItem1);
        receiptItems.add(receiptItem2);
        Receipt receipt= new Receipt(receiptItems);

        assertEquals(22.5, receipt.price(), 0.001);
    }
}