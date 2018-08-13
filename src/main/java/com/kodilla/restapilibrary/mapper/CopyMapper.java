package com.kodilla.restapilibrary.mapper;

import com.kodilla.restapilibrary.domain.dto.CopyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CopyMapper {

    @Autowired
    private TitleMapper titleMapper;

    public Copy mapToCopy(Title title) {
        return new Copy(title, Copy.STATUS_AVAILABLE);
    }

    public Copy mapToCopy(CopyDto copyDto) {
        return new Copy(
                titleMapper.mapToTitle(copyDto.getTitleDto()),
                copyDto.getStatus()
        );
    }

    public CopyDto mapToCopyDto(Copy copy) {
        return new CopyDto(
                copy.getId(),
                titleMapper.mapToTitleDto(copy.getTitle()),
                copy.getStatus()
        );
    }
}
