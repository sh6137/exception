package com.example.exception.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class User {
    @NotEmpty
    @Size(min = 1,max = 100)
    private String name;
    @Min(1)
    @NotNull
    private Integer age;
}
