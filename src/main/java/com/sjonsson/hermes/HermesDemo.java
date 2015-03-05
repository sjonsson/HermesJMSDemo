package com.sjonsson.hermes;

import java.io.Serializable;

/**
 * Simple Java Bean meant to demonstrate HermesJMS capabilities
 * 
 * @author Stan Jonsson
 */
public class HermesDemo implements Serializable {
    
    private String foo;
    private String bar;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
    
}
