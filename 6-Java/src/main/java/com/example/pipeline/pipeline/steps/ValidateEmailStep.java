package com.example.pipeline.pipeline.steps;

import com.example.pipeline.model.User;
import com.example.pipeline.pipeline.PipelineStep;

public class ValidateEmailStep implements PipelineStep<User> {
    @Override
    public User process(User input) {
        if (input.getEmail() == null || !input.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        return input;
    }
}
