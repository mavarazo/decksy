package com.decksy.mapper;

import com.decksy.model.Card;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CardMapperTest {

  @Test
  public void toModel() {
    // Arrange
    io.magicthegathering.javasdk.resource.Card source =
        new io.magicthegathering.javasdk.resource.Card();
    source.setName("Archangel Avacyn");
    source.setManaCost("{3}{W}{W}");
    source.setCmc(5);
    source.setColors(new String[] {"White"});
    source.setType("Legendary Creature — Angel");
    source.setSupertypes(new String[] {"Legendary"});
    source.setTypes(new String[] {"Creature"});
    source.setSubtypes(new String[] {"Angel"});
    source.setRarity("Mythic Rare");
    source.setPower("4");
    source.setToughness("4");
    source.setMultiverseid(409741);
    source.setImageUrl(
        "http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=409741&type=card");

    // Act
    Card target = CardMapper.INSTANCE.toModel(source);

    // Assert
    assertThat(target.getName(), is("Archangel Avacyn"));
    assertThat(target.getManaCost(), is("{3}{W}{W}"));
    assertThat(target.getCmc(), is(5.0));
    assertThat(target.getColors(), hasSize(1));
    assertThat(target.getType(), is("Legendary Creature — Angel"));
    assertThat(target.getSupertypes(), hasSize(1));
    assertThat(target.getTypes(), hasSize(1));
    assertThat(target.getSubtypes(), hasSize(1));
    assertThat(target.getRarity(), is("Mythic Rare"));
    assertThat(target.getPower(), is("4"));
    assertThat(target.getToughness(), is("4"));
    assertThat(target.getMultiverseId(), is(409741));
    assertThat(target.getImageUrl(), is("http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=409741&type=card"));

  }
}
