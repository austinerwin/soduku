package com.cooksys.soduku.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cooksys.soduku.dto.ChairDto;
import com.cooksys.soduku.dto.ChairDtoWithId;
import com.cooksys.soduku.entity.Chair;

@Mapper(componentModel = "spring")
public interface ChairMapper {

	@Mappings({ @Mapping(source = "price", target = "itemDetail.price"),
		@Mapping(source = "serialNumber", target = "itemDetail.serialNumber") })
	Chair fromDto(ChairDto dto);
	
	
	@Mappings({ @Mapping(source = "itemDetail.price", target = "price"),
			@Mapping(source = "itemDetail.serialNumber", target = "serialNumber") })
	ChairDto toDto(Chair chair);

	@Mappings({ @Mapping(source = "itemDetail.price", target = "price"),
		@Mapping(source = "itemDetail.serialNumber", target = "serialNumber") })
	ChairDtoWithId toDtoWithId(Chair chair);

	
	@Mappings({ @Mapping(source = "price", target = "itemDetail.price"),
		@Mapping(source = "serialNumber", target = "itemDetail.serialNumber") })
	Chair fromDtoWithId(ChairDtoWithId dto);

}
