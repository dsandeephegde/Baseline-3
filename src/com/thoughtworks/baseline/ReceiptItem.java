//It is an Item in Receipt for which sales tax has to be calculated
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class ReceiptItem {

    private int noOfGoods;
    private String name;
    private double price;
    private boolean isImported;

    public ReceiptItem(int noOfGoods, String name, double price, boolean isImported) {
        this.noOfGoods = noOfGoods;
        this.name = name;
        this.price = price;
        this.isImported = isImported;
    }

    public double salesTax() {
        if(isImported)
            return 0.15 * price;
        return 0.1 * price;
    }
}
