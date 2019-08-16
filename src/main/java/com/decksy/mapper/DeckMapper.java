package com.decksy.mapper;

import com.decksy.dto.DeckDto;
import com.decksy.model.Deck;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper
@MapperConfig(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface DeckMapper {

  DeckMapper INSTANCE = Mappers.getMapper(DeckMapper.class);

  Deck toModel(DeckDto dto);

  DeckDto toDto(Deck deck);
}
