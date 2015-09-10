//Has Receipt Items which calculates total sales tax and price
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Receipt {

    private ArrayList<ReceiptItem> receiptItems = new ArrayList<ReceiptItem>();

    public Receipt(ArrayList<ReceiptItem> receiptItems) {
        this.receiptItems = receiptItems;
    }

    public double totalSalesTax() {
        double salesTax = 0;
        for (ReceiptItem receiptItem : receiptItems ) {
            salesTax += receiptItem.salesTax();
        }
        return salesTax;
    }

    public double price() {
        double price = 0;
        for (ReceiptItem receiptItem : receiptItems) {
            price += receiptItem.price();
        }
        return price;
    }
}