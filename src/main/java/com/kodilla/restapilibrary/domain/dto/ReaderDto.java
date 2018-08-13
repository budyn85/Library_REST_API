package com.kodilla.restapilibrary.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReaderDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Date created;
}
