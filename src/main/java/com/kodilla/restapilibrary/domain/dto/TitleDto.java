package com.kodilla.restapilibrary.domain.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TitleDto {
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
}
