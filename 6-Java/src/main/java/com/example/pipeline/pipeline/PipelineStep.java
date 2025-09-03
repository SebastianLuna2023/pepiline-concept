package com.example.pipeline.pipeline;

public interface PipelineStep<T> {
    T process(T input);
}
