package com.kodilla.restapilibrary.mapper;

import com.kodilla.restapilibrary.domain.dto.ReaderDto;
import org.springframework.stereotype.Component;

import java.io.Reader;

@Component
public class ReaderMapper {

    public ReaderDto mapToReaderDto(Reader reader) {
        return new ReaderDto(reader.getId(),
                reader.getFirstName(),
                reader.getLastName(),
                reader.getCreated());
    }

    public Reader mapToReader(ReaderDto readerDto) {
        return new Reader(
                readerDto.getFirstName(),
                readerDto.getLastName());
    }
}