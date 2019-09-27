package com.decksy.batch.mtgjson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
    value = {"foreignData", "legalities", "prices", "printings", "purchaseUrls", "rulings"})
public class MtgJsonCard {

  private String artist;
  private String borderColor;
  private String[] colorIdentity;
  private String colorIndicator;
  private String[] colors;
  private Double convertedManaCost;
  private String duelDeck;
  private String edhrecRank;
  private Double faceConvertedManaCost;
  private String flavorText;
  private String frameEffect;
  private String frameVersion;
  private String hand;

  private boolean hasFoil;

  private boolean hasNoDeckLimit;

  private boolean hasNonFoil;

  private boolean isAlternative;

  private boolean isArena;

  private boolean isFullArt;

  private boolean isMtgo;

  private boolean isOnlineOnly;

  private boolean isOversized;

  private boolean isPaper;

  private boolean isPromo;

  private boolean isReprint;

  private boolean isReserved;

  private boolean isStarter;

  private boolean isStorySpotlight;

  private boolean isTextless;

  private boolean isTimeshifted;

  private String layout;
  private String leadershipSkills;
  private String life;
  private String loyalty;
  private String manaCost;
  private Integer mcmId;
  private Integer mcmMetaId;
  private String mcmName;
  private Integer mtgArenaId;
  private Integer mtgoFoilId;
  private Integer mtgoId;
  private Integer mtgstocksId;
  private Integer multiverseId;
  private String name;
  private String names;
  private String number;
  private String originalText;
  private String originalType;
  private String power;
  private String printings;
  private String purchaseUrls;
  private String rarity;
  private String scryfallId;
  private String scryfallIllustrationId;
  private String scryfallOracleId;
  private String setCode;
  private String side;
  private String[] subtypes;
  private String[] supertypes;
  private Integer tcgplayerProductId;
  private String tcgplayerPurchaseUrl;
  private String text;
  private String toughness;
  private String type;
  private String[] types;
  private String uuid;
  private String variations;
  private String watermarkprivate;

  public String getArtist() {
    return artist;
  }

  public MtgJsonCard setArtist(String artist) {
    this.artist = artist;
    return this;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public MtgJsonCard setBorderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  public String[] getColorIdentity() {
    return colorIdentity;
  }

  public MtgJsonCard setColorIdentity(String[] colorIdentity) {
    this.colorIdentity = colorIdentity;
    return this;
  }

  public String getColorIndicator() {
    return colorIndicator;
  }

  public MtgJsonCard setColorIndicator(String colorIndicator) {
    this.colorIndicator = colorIndicator;
    return this;
  }

  public String[] getColors() {
    return colors;
  }

  public MtgJsonCard setColors(String[] colors) {
    this.colors = colors;
    return this;
  }

  public Double getConvertedManaCost() {
    return convertedManaCost;
  }

  public MtgJsonCard setConvertedManaCost(Double convertedManaCost) {
    this.convertedManaCost = convertedManaCost;
    return this;
  }

  public String getDuelDeck() {
    return duelDeck;
  }

  public MtgJsonCard setDuelDeck(String duelDeck) {
    this.duelDeck = duelDeck;
    return this;
  }

  public String getEdhrecRank() {
    return edhrecRank;
  }

  public MtgJsonCard setEdhrecRank(String edhrecRank) {
    this.edhrecRank = edhrecRank;
    return this;
  }

  public Double getFaceConvertedManaCost() {
    return faceConvertedManaCost;
  }

  public MtgJsonCard setFaceConvertedManaCost(Double faceConvertedManaCost) {
    this.faceConvertedManaCost = faceConvertedManaCost;
    return this;
  }

  public String getFlavorText() {
    return flavorText;
  }

  public MtgJsonCard setFlavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  public String getFrameEffect() {
    return frameEffect;
  }

  public MtgJsonCard setFrameEffect(String frameEffect) {
    this.frameEffect = frameEffect;
    return this;
  }

  public String getFrameVersion() {
    return frameVersion;
  }

  public MtgJsonCard setFrameVersion(String frameVersion) {
    this.frameVersion = frameVersion;
    return this;
  }

  public String getHand() {
    return hand;
  }

  public MtgJsonCard setHand(String hand) {
    this.hand = hand;
    return this;
  }

  public boolean isHasFoil() {
    return hasFoil;
  }

  public MtgJsonCard setHasFoil(boolean hasFoil) {
    this.hasFoil = hasFoil;
    return this;
  }

  public boolean isHasNoDeckLimit() {
    return hasNoDeckLimit;
  }

  public MtgJsonCard setHasNoDeckLimit(boolean hasNoDeckLimit) {
    this.hasNoDeckLimit = hasNoDeckLimit;
    return this;
  }

  public boolean isHasNonFoil() {
    return hasNonFoil;
  }

  public MtgJsonCard setHasNonFoil(boolean hasNonFoil) {
    this.hasNonFoil = hasNonFoil;
    return this;
  }

  public boolean isAlternative() {
    return isAlternative;
  }

  public MtgJsonCard setIsAlternative(boolean alternative) {
    isAlternative = alternative;
    return this;
  }

  public boolean isArena() {
    return isArena;
  }

  public MtgJsonCard setIsArena(boolean arena) {
    isArena = arena;
    return this;
  }

  public boolean isFullArt() {
    return isFullArt;
  }

  public MtgJsonCard setIsFullArt(boolean fullArt) {
    isFullArt = fullArt;
    return this;
  }

  public boolean isMtgo() {
    return isMtgo;
  }

  public MtgJsonCard setIsMtgo(boolean mtgo) {
    isMtgo = mtgo;
    return this;
  }

  public boolean isOnlineOnly() {
    return isOnlineOnly;
  }

  public MtgJsonCard setIsOnlineOnly(boolean onlineOnly) {
    isOnlineOnly = onlineOnly;
    return this;
  }

  public boolean isOversized() {
    return isOversized;
  }

  public MtgJsonCard setIsOversized(boolean oversized) {
    isOversized = oversized;
    return this;
  }

  public boolean isPaper() {
    return isPaper;
  }

  public MtgJsonCard setIsPaper(boolean paper) {
    isPaper = paper;
    return this;
  }

  public boolean isPromo() {
    return isPromo;
  }

  public MtgJsonCard setIsPromo(boolean promo) {
    isPromo = promo;
    return this;
  }

  public boolean isReprint() {
    return isReprint;
  }

  public MtgJsonCard setIsReprint(boolean reprint) {
    isReprint = reprint;
    return this;
  }

  public boolean isReserved() {
    return isReserved;
  }

  public MtgJsonCard setIsReserved(boolean reserved) {
    isReserved = reserved;
    return this;
  }

  public boolean isStarter() {
    return isStarter;
  }

  public MtgJsonCard setIsStarter(boolean starter) {
    isStarter = starter;
    return this;
  }

  public boolean isStorySpotlight() {
    return isStorySpotlight;
  }

  public MtgJsonCard setIsStorySpotlight(boolean storySpotlight) {
    isStorySpotlight = storySpotlight;
    return this;
  }

  public boolean isTextless() {
    return isTextless;
  }

  public MtgJsonCard setIsTextless(boolean textless) {
    isTextless = textless;
    return this;
  }

  public boolean isTimeshifted() {
    return isTimeshifted;
  }

  public MtgJsonCard setIsTimeshifted(boolean timeshifted) {
    isTimeshifted = timeshifted;
    return this;
  }

  public String getLayout() {
    return layout;
  }

  public MtgJsonCard setLayout(String layout) {
    this.layout = layout;
    return this;
  }

  public String getLeadershipSkills() {
    return leadershipSkills;
  }

  public MtgJsonCard setLeadershipSkills(String leadershipSkills) {
    this.leadershipSkills = leadershipSkills;
    return this;
  }

  public String getLife() {
    return life;
  }

  public MtgJsonCard setLife(String life) {
    this.life = life;
    return this;
  }

  public String getLoyalty() {
    return loyalty;
  }

  public MtgJsonCard setLoyalty(String loyalty) {
    this.loyalty = loyalty;
    return this;
  }

  public String getManaCost() {
    return manaCost;
  }

  public MtgJsonCard setManaCost(String manaCost) {
    this.manaCost = manaCost;
    return this;
  }

  public Integer getMcmId() {
    return mcmId;
  }

  public MtgJsonCard setMcmId(Integer mcmId) {
    this.mcmId = mcmId;
    return this;
  }

  public Integer getMcmMetaId() {
    return mcmMetaId;
  }

  public MtgJsonCard setMcmMetaId(Integer mcmMetaId) {
    this.mcmMetaId = mcmMetaId;
    return this;
  }

  public String getMcmName() {
    return mcmName;
  }

  public MtgJsonCard setMcmName(String mcmName) {
    this.mcmName = mcmName;
    return this;
  }

  public Integer getMtgArenaId() {
    return mtgArenaId;
  }

  public MtgJsonCard setMtgArenaId(Integer mtgArenaId) {
    this.mtgArenaId = mtgArenaId;
    return this;
  }

  public Integer getMtgoFoilId() {
    return mtgoFoilId;
  }

  public MtgJsonCard setMtgoFoilId(Integer mtgoFoilId) {
    this.mtgoFoilId = mtgoFoilId;
    return this;
  }

  public Integer getMtgoId() {
    return mtgoId;
  }

  public MtgJsonCard setMtgoId(Integer mtgoId) {
    this.mtgoId = mtgoId;
    return this;
  }

  public Integer getMtgstocksId() {
    return mtgstocksId;
  }

  public MtgJsonCard setMtgstocksId(Integer mtgstocksId) {
    this.mtgstocksId = mtgstocksId;
    return this;
  }

  public Integer getMultiverseId() {
    return multiverseId;
  }

  public MtgJsonCard setMultiverseId(Integer multiverseId) {
    this.multiverseId = multiverseId;
    return this;
  }

  public String getName() {
    return name;
  }

  public MtgJsonCard setName(String name) {
    this.name = name;
    return this;
  }

  public String getNames() {
    return names;
  }

  public MtgJsonCard setNames(String names) {
    this.names = names;
    return this;
  }

  public String getNumber() {
    return number;
  }

  public MtgJsonCard setNumber(String number) {
    this.number = number;
    return this;
  }

  public String getOriginalText() {
    return originalText;
  }

  public MtgJsonCard setOriginalText(String originalText) {
    this.originalText = originalText;
    return this;
  }

  public String getOriginalType() {
    return originalType;
  }

  public MtgJsonCard setOriginalType(String originalType) {
    this.originalType = originalType;
    return this;
  }

  public String getPower() {
    return power;
  }

  public MtgJsonCard setPower(String power) {
    this.power = power;
    return this;
  }

  public String getPrintings() {
    return printings;
  }

  public MtgJsonCard setPrintings(String printings) {
    this.printings = printings;
    return this;
  }

  public String getPurchaseUrls() {
    return purchaseUrls;
  }

  public MtgJsonCard setPurchaseUrls(String purchaseUrls) {
    this.purchaseUrls = purchaseUrls;
    return this;
  }

  public String getRarity() {
    return rarity;
  }

  public MtgJsonCard setRarity(String rarity) {
    this.rarity = rarity;
    return this;
  }

  public String getScryfallId() {
    return scryfallId;
  }

  public MtgJsonCard setScryfallId(String scryfallId) {
    this.scryfallId = scryfallId;
    return this;
  }

  public String getScryfallIllustrationId() {
    return scryfallIllustrationId;
  }

  public MtgJsonCard setScryfallIllustrationId(String scryfallIllustrationId) {
    this.scryfallIllustrationId = scryfallIllustrationId;
    return this;
  }

  public String getScryfallOracleId() {
    return scryfallOracleId;
  }

  public MtgJsonCard setScryfallOracleId(String scryfallOracleId) {
    this.scryfallOracleId = scryfallOracleId;
    return this;
  }

  public String getSetCode() {
    return setCode;
  }

  public MtgJsonCard setSetCode(String setCode) {
    this.setCode = setCode;
    return this;
  }

  public String getSide() {
    return side;
  }

  public MtgJsonCard setSide(String side) {
    this.side = side;
    return this;
  }

  public String[] getSubtypes() {
    return subtypes;
  }

  public MtgJsonCard setSubtypes(String[] subtypes) {
    this.subtypes = subtypes;
    return this;
  }

  public String[] getSupertypes() {
    return supertypes;
  }

  public MtgJsonCard setSupertypes(String[] supertypes) {
    this.supertypes = supertypes;
    return this;
  }

  public Integer getTcgplayerProductId() {
    return tcgplayerProductId;
  }

  public MtgJsonCard setTcgplayerProductId(Integer tcgplayerProductId) {
    this.tcgplayerProductId = tcgplayerProductId;
    return this;
  }

  public String getTcgplayerPurchaseUrl() {
    return tcgplayerPurchaseUrl;
  }

  public MtgJsonCard setTcgplayerPurchaseUrl(String tcgplayerPurchaseUrl) {
    this.tcgplayerPurchaseUrl = tcgplayerPurchaseUrl;
    return this;
  }

  public String getText() {
    return text;
  }

  public MtgJsonCard setText(String text) {
    this.text = text;
    return this;
  }

  public String getToughness() {
    return toughness;
  }

  public MtgJsonCard setToughness(String toughness) {
    this.toughness = toughness;
    return this;
  }

  public String getType() {
    return type;
  }

  public MtgJsonCard setType(String type) {
    this.type = type;
    return this;
  }

  public String[] getTypes() {
    return types;
  }

  public MtgJsonCard setTypes(String[] types) {
    this.types = types;
    return this;
  }

  public String getUuid() {
    return uuid;
  }

  public MtgJsonCard setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getVariations() {
    return variations;
  }

  public MtgJsonCard setVariations(String variations) {
    this.variations = variations;
    return this;
  }

  public String getWatermarkprivate() {
    return watermarkprivate;
  }

  public MtgJsonCard setWatermarkprivate(String watermarkprivate) {
    this.watermarkprivate = watermarkprivate;
    return this;
  }
}
