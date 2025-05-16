package com.mycompany.tla003;

import java.util.Scanner;
import java.util.Stack;

public class TLA003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();

        System.out.print("Enter some words: ");
        String line = sc.nextLine();

        // this will words from the single input line
        Scanner ls = new Scanner(line);
        while (ls.hasNext()) {
            st.push(ls.next());
        }

        // Output in reverse order
        while (!st.isEmpty()) {
            System.out.print(st.pop());
            if (!st.isEmpty()) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
