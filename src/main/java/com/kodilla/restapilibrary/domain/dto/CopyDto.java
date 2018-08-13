package com.kodilla.restapilibrary.domain.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CopyDto {
    private Long id;

    private TitleDto titleDto;

    private String status;
}