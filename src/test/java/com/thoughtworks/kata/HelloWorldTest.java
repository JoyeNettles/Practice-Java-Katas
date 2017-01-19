package com.thoughtworks.kata;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldTest {

    @Test
    public void shouldPrintHelloWorld() throws Exception {
        HelloWorld app = new HelloWorld();
        String result = app.hello();
        assertThat(result, is("Hello"));
    }
}
