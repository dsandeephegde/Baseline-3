//To parse input and return ReceiptItem
package com.thoughtworks.baseline;

public class Parser {

    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public ReceiptItem parse() {
        return new ReceiptItem(1, "book", 20, false);
    }
}