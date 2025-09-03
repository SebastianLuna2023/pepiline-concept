package com.example.pipeline.service;

import com.example.pipeline.model.User;
import com.example.pipeline.pipeline.Pipeline;
import com.example.pipeline.pipeline.steps.NormalizeNameStep;
import com.example.pipeline.pipeline.steps.ValidateEmailStep;
import com.example.pipeline.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final Pipeline<User> pipeline;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.pipeline = new Pipeline<>(
                Arrays.asList(
                        new NormalizeNameStep(),
                        new ValidateEmailStep()
                )
        );
    }

    public User createUser(User user) {
        User processed = pipeline.execute(user);
        return userRepository.save(processed);
    }
}
