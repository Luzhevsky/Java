package com.Patterns.Adapter.NewProcessor;

public interface Processor {
    String name();
    Object process(Object input);
}
