package com.weight.tracker.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDTO {

    @NotEmpty(message = "Please enter firstName.")
    private String firstName;

    @JsonInclude
    private String middleName;

    @NotEmpty(message = "Please enter lastName.")
    private String lastName;

    @JsonInclude
    private String suffix;

    @NotEmpty(message = "Please enter dateOfBirth.")
    private String dateOfBirth;
    @Min(value = 1, message = "Please enter age greater than or equal to 0.")
    @PositiveOrZero
    @Digits(message = "Please enter a valid age up to 3 numbers.", integer = 2, fraction = 2)
    private Integer age;
    @Positive
    @PositiveOrZero
    @Min(value = 1, message = "Please enter weight greater than or equal to 0.")
    private Integer weight;
}
