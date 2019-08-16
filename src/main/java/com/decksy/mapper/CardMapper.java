package com.decksy.mapper;

import com.decksy.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ColorsMapper.class, TypesMapper.class})
@MapperConfig(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CardMapper {

  CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "created", ignore = true)
  @Mapping(target = "updated", ignore = true)
  @Mapping(target = "deckCards", ignore = true)
  @Mapping(source = "multiverseid", target = "multiverseId")
  Card toModel(io.magicthegathering.javasdk.resource.Card card);
}
