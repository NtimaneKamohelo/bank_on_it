package com.kamo.bankOnIt.dto;

public record RegisterRequest(
        String email,
        String password
) {}
