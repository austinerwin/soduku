package com.cooksys.soduku.mapstruct;

import org.mapstruct.Mapper;

import com.cooksys.soduku.dto.ChairDto;
import com.cooksys.soduku.dto.ChairDtoWithId;
import com.cooksys.soduku.entity.Chair;

@Mapper(componentModel = "spring")
public interface ChairMapper {

	Chair fromDto(ChairDto dto);
	
	ChairDto toDto(Chair chair);
	
	ChairDtoWithId toDtoWithId(Chair chair);
	
	Chair fromDtoWithId(ChairDtoWithId dto);
	
}
