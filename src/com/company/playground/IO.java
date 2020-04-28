package com.company.playground;

import java.util.Scanner;

public class IO {

    public String scanNextLine() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

}
