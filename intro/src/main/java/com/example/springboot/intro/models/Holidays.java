package com.example.springboot.intro.models;

import jakarta.validation.constraints.NotBlank;

public record Holidays(String day,
                       String reason, Type type) {
}
