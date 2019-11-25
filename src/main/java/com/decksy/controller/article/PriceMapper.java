package com.decksy.controller.article;

import com.decksy.domain.Price;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface PriceMapper {
  PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

  PriceDto toDto(Price source);
}
