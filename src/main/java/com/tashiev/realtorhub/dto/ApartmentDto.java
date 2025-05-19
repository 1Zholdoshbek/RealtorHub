package com.tashiev.realtorhub.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ApartmentDto {
    private Long id;

    @NotBlank(message = "Название обязательно")
    private String title;

    @NotBlank(message = "Локация обязательна")
    private String location;

    @NotNull(message = "Цена обязательна")
    @DecimalMin(value = "0.0", inclusive = false, message = "Цена должна быть положительной")
    private BigDecimal price;

    @Min(value = 1, message = "Минимум одна комната")
    private int rooms;
}
