package com.example.pipeline.pipeline.steps;

import com.example.pipeline.model.User;
import com.example.pipeline.pipeline.PipelineStep;

public class NormalizeNameStep implements PipelineStep<User> {
    @Override
    public User process(User input) {
        input.setName(input.getName().trim().toUpperCase());
        return input;
    }
}
