package com.mav.decksy.controller.article;

import com.mav.decksy.api.mkm.marketplace.PriceGuide;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface PriceGuideMapper {
  PriceGuideMapper INSTANCE = Mappers.getMapper(PriceGuideMapper.class);

  PriceGuideDto toDto(PriceGuide mkmPriceGuide);
}
