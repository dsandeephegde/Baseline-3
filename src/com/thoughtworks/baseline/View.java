package com.thoughtworks.baseline;

import java.io.PrintStream;
import java.util.Scanner;

public class View {

    private PrintStream printStream;
    private Scanner scanner;

    public View(Scanner scanner, PrintStream printStream) {
        this.printStream = printStream;
        this.scanner = scanner;
    }

    public String input() {
        return scanner.nextLine();
    }

    public void output(String message) {
        printStream.print(message);
    }
}
