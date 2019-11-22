package com.decksy.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductMapper {
  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  @Mapping(target = "article", ignore = true)
  @Mapping(target = "createDateTime", ignore = true)
  @Mapping(source = "expansion", target = "expansion")
  @Mapping(target = "id", ignore = true)
  @Mapping(source = "enName", target = "name")
  @Mapping(target = "productId", ignore = true)
  @Mapping(source = "rarity", target = "rarity")
  @Mapping(target = "updateDateTime", ignore = true)
  Product toDomain(com.decksy.api.mkm.stock.Product source);
}
