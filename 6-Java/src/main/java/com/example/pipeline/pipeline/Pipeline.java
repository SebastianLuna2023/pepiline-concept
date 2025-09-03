package com.example.pipeline.pipeline;

import java.util.List;

public class Pipeline<T> {

    private final List<PipelineStep<T>> steps;

    public Pipeline(List<PipelineStep<T>> steps) {
        this.steps = steps;
    }

    public T execute(T input) {
        T current = input;
        for (PipelineStep<T> step : steps) {
            current = step.process(current);
        }
        return current;
    }
}
