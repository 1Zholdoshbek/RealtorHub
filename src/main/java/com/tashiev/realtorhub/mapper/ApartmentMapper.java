package com.tashiev.realtorhub.mapper;


import com.tashiev.realtorhub.dto.ApartmentDto;
import com.tashiev.realtorhub.entity.Apartment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApartmentMapper {

    ApartmentDto toDto(Apartment apartment);

    Apartment toEntity(ApartmentDto apartmentDto);
}
