package com.decksy.controller.article;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.decksy.api.mkm.marketplace.PriceGuide;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface PriceGuideMapper {
  PriceGuideMapper INSTANCE = Mappers.getMapper(PriceGuideMapper.class);

  PriceGuideDto toDto(PriceGuide mkmPriceGuide);
}
