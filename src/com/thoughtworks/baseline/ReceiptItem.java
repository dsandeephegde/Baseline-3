//It is an Item in Receipt for which sales tax has to be calculated
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class ReceiptItem {

    private int noOfGoods;
    private String name;
    private double cost;
    private boolean isImported;
    private ArrayList<String> exceptionList = new ArrayList<String>();

    public ReceiptItem(int noOfGoods, String name, double cost, boolean isImported) {
        this.noOfGoods = noOfGoods;
        this.name = name;
        this.cost = cost;
        this.isImported = isImported;
        exceptionList.add("book");
        exceptionList.add("food");
        exceptionList.add("chocolate");
        exceptionList.add("pills");
    }

    public double salesTax() {
        double tax = 0;
        if(!exceptionList.contains(name))
            tax += 0.1;
        if(isImported)
            tax += 0.05;
        return tax * cost;
    }

    public double price() {
        return salesTax() + cost;
    }
}
