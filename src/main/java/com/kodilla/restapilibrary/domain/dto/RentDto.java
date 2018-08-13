package com.kodilla.restapilibrary.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class RentDto {
    private Long id;
    private ReaderDto readerDto;
    private CopyDto copyDto;
    private Date rentDate;
    private Date returnDate;
}
