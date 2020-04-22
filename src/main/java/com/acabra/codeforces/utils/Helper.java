package com.acabra.codeforces.utils;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Helper {
    final BufferedReader bf;
    final PrintWriter out;
    StringTokenizer tokenizer;

    public Helper(BufferedReader bf, PrintWriter out) {
        this.bf = bf;
        this.out = out;
    }

    public static Scanner getScannerFromFile(String fileName) {
        return new Scanner(fileAsStream(fileName));
    }

    public int nInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nLong() throws IOException {
        return Long.parseLong(next());
    }

    public double nDouble() throws IOException {
        return Double.parseDouble(next());
    }

    String next() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(bf.readLine());
        }
        return tokenizer.nextToken();
    }

    public void close() throws IOException {
        bf.close();
        out.flush();
    }

    public static Helper of(InputStream in) {
        return of(in, new OutputStreamWriter(System.out));
    }

    public static Helper of(String fileName) {
        return of(fileAsStream(fileName), new OutputStreamWriter(System.out));
    }

    static Helper of(InputStream in, OutputStreamWriter iOut) {
        return new Helper(new BufferedReader(new InputStreamReader(in)), new PrintWriter(iOut));
    }

    public static InputStream fileAsStream(String fileName) {
        return Helper.class.getClassLoader().getResourceAsStream(fileName);
    }
}
