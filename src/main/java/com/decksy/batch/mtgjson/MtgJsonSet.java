package com.decksy.batch.mtgjson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(value = {"boosterV3", "translations", "tokens"})
public class MtgJsonSet {

  private Integer baseSetSize;
  private String block;
  private String boosterV3;
  private String code;
  private String codeV3;
  private boolean isFoilOnly;
  private boolean isForeignOnly;
  private boolean isOnlineOnly;
  private boolean isPartialPreview;
  private String keyruneCode;
  private Integer mcmId;;
  private String mcmName;
  private MtgJsonMeta meta;
  private String mtgoCode;
  private String name;
  private String parentCode;
  private String releaseDate;
  private Integer tcgplayerGroupId;;
  private Integer totalSetSize;
  private String type;

  private List<MtgJsonCard> cards = new ArrayList<>();

  public Integer getBaseSetSize() {
    return baseSetSize;
  }

  public MtgJsonSet setBaseSetSize(Integer baseSetSize) {
    this.baseSetSize = baseSetSize;
    return this;
  }

  public String getBlock() {
    return block;
  }

  public MtgJsonSet setBlock(String block) {
    this.block = block;
    return this;
  }

  public String getBoosterV3() {
    return boosterV3;
  }

  public MtgJsonSet setBoosterV3(String boosterV3) {
    this.boosterV3 = boosterV3;
    return this;
  }

  public String getCode() {
    return code;
  }

  public MtgJsonSet setCode(String code) {
    this.code = code;
    return this;
  }

  public String getCodeV3() {
    return codeV3;
  }

  public MtgJsonSet setCodeV3(String codeV3) {
    this.codeV3 = codeV3;
    return this;
  }

  public boolean getFoilOnly() {
    return isFoilOnly;
  }

  public MtgJsonSet setIsFoilOnly(boolean foilOnly) {
    isFoilOnly = foilOnly;
    return this;
  }

  public boolean getForeignOnly() {
    return isForeignOnly;
  }

  public MtgJsonSet setIsForeignOnly(boolean foreignOnly) {
    isForeignOnly = foreignOnly;
    return this;
  }

  public boolean getOnlineOnly() {
    return isOnlineOnly;
  }

  public MtgJsonSet setIsOnlineOnly(boolean onlineOnly) {
    isOnlineOnly = onlineOnly;
    return this;
  }

  public boolean getPartialPreview() {
    return isPartialPreview;
  }

  public MtgJsonSet setIsPartialPreview(boolean partialPreview) {
    isPartialPreview = partialPreview;
    return this;
  }

  public String getKeyruneCode() {
    return keyruneCode;
  }

  public MtgJsonSet setKeyruneCode(String keyruneCode) {
    this.keyruneCode = keyruneCode;
    return this;
  }

  public Integer getMcmId() {
    return mcmId;
  }

  public MtgJsonSet setMcmId(Integer mcmId) {
    this.mcmId = mcmId;
    return this;
  }

  public String getMcmName() {
    return mcmName;
  }

  public MtgJsonSet setMcmName(String mcmName) {
    this.mcmName = mcmName;
    return this;
  }

  public MtgJsonMeta getMeta() {
    return meta;
  }

  public MtgJsonSet setMeta(MtgJsonMeta meta) {
    this.meta = meta;
    return this;
  }

  public String getMtgoCode() {
    return mtgoCode;
  }

  public MtgJsonSet setMtgoCode(String mtgoCode) {
    this.mtgoCode = mtgoCode;
    return this;
  }

  public String getName() {
    return name;
  }

  public MtgJsonSet setName(String name) {
    this.name = name;
    return this;
  }

  public String getParentCode() {
    return parentCode;
  }

  public MtgJsonSet setParentCode(String parentCode) {
    this.parentCode = parentCode;
    return this;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public MtgJsonSet setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  public Integer getTcgplayerGroupId() {
    return tcgplayerGroupId;
  }

  public MtgJsonSet setTcgplayerGroupId(Integer tcgplayerGroupId) {
    this.tcgplayerGroupId = tcgplayerGroupId;
    return this;
  }

  public Integer getTotalSetSize() {
    return totalSetSize;
  }

  public MtgJsonSet setTotalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  public String getType() {
    return type;
  }

  public MtgJsonSet setType(String type) {
    this.type = type;
    return this;
  }

  public List<MtgJsonCard> getCards() {
    return cards;
  }

  public MtgJsonSet setCards(List<MtgJsonCard> cards) {
    this.cards = cards;
    return this;
  }
}
