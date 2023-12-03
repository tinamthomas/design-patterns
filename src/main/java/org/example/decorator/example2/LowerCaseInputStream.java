package org.example.decorator.example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    InputStream in;

    public LowerCaseInputStream(InputStream in) {
        super(in);
        this.in = in;
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1) ? c : Character.toLowerCase(c);
    }
}
