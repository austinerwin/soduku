package com.cooksys.soduku.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.dto.TableDtoWithId;
import com.cooksys.soduku.entity.Table;

@Mapper(componentModel = "spring")
public interface TableMapper {

	@Mappings({ @Mapping(source = "price", target = "itemDetail.price"),
		@Mapping(source = "serialNumber", target = "itemDetail.serialNumber") })
	Table fromDto(TableDto dto);
	

	@Mappings({ @Mapping(source = "itemDetail.price", target = "price"),
			@Mapping(source = "itemDetail.serialNumber", target = "serialNumber") })
	TableDto toDto(Table table);
	
	@Mappings({ @Mapping(source = "price", target = "itemDetail.price"),
		@Mapping(source = "serialNumber", target = "itemDetail.serialNumber") })
	Table fromDtoWithId(TableDtoWithId dto);
	

	@Mappings({ @Mapping(source = "itemDetail.price", target = "price"),
			@Mapping(source = "itemDetail.serialNumber", target = "serialNumber") })
	TableDtoWithId toDtoWithId(Table table);
	
}
