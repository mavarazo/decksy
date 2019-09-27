package com.decksy.batch.mtgjson;

import com.decksy.mapper.CardMapper;
import com.decksy.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface MtgJsonCardMapper {
  MtgJsonCardMapper INSTANCE = Mappers.getMapper(MtgJsonCardMapper.class);

  @Mapping(target = "id", ignore = true)
  @Mapping(source = "name", target = "name")
  @Mapping(target = "updated", ignore = true)
  @Mapping(target = "created", ignore = true)
  @Mapping(target = "deckCards", ignore = true)
  @Mapping(source = "multiverseId", target = "multiverseId")
  @Mapping(target = "supertypes", ignore = true)
  @Mapping(source = "convertedManaCost", target = "cmc")
  @Mapping(target = "colors", ignore = true)
  @Mapping(target = "imageUrl", ignore = true)
  @Mapping(source = "layout", target = "layout")
  @Mapping(source = "manaCost", target = "manaCost")
  @Mapping(target = "mtgId", ignore = true)
  @Mapping(source = "power", target = "power")
  @Mapping(source = "rarity", target = "rarity")
  @Mapping(source = "setCode", target = "set")
  @Mapping(target = "setName", ignore = true)
  @Mapping(target = "subtypes", ignore = true)
  @Mapping(source = "toughness", target = "toughness")
  @Mapping(source = "type", target = "type")
  @Mapping(target = "types", ignore = true)
  Card toModel(MtgJsonCard source);
}
