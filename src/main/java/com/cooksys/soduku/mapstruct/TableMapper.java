package com.cooksys.soduku.mapstruct;

import org.mapstruct.Mapper;

import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.dto.TableDtoWithId;
import com.cooksys.soduku.entity.Table;

@Mapper(componentModel = "spring")
public interface TableMapper {

	Table fromDto(TableDto dto);
	
	TableDto toDto(Table table);
	
	Table fromDtoWithId(TableDtoWithId dto);
	
	TableDtoWithId toDtoWithId(Table table);
	
}
