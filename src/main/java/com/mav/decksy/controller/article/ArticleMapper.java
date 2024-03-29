package com.mav.decksy.controller.article;

import com.mav.decksy.model.Article;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    uses = {ProductMapper.class, PriceMapper.class})
public interface ArticleMapper {
  ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);

  @Mapping(source = "isAltered", target = "altered")
  @Mapping(source = "idArticle", target = "articleId")
  @Mapping(target = "createDateTime", ignore = true)
  @Mapping(source = "comments", target = "comments")
  @Mapping(source = "condition", target = "condition")
  @Mapping(source = "count", target = "count")
  @Mapping(source = "isFoil", target = "foil")
  @Mapping(target = "id", ignore = true)
  @Mapping(source = "language.idLanguage", target = "languageId")
  @Mapping(source = "isPlayset", target = "playset")
  @Mapping(target = "prices", ignore = true)
  @Mapping(target = "product", ignore = true)
  @Mapping(source = "isSigned", target = "signed")
  @Mapping(target = "updateDateTime", ignore = true)
  Article toModel(com.mav.decksy.api.mkm.stock.Article source);

  @Mapping(target = "latestPrice", ignore = true)
  @Mapping(target = "priceGuide", ignore = true)
  ArticleDto toDto(Article source);
}
