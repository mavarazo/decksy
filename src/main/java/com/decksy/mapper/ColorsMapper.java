package com.decksy.mapper;

import com.decksy.model.Color;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColorsMapper {

  public List<Color> toType(String[] colors) {
    return Arrays.stream(colors).map(c -> new Color().setColor(c)).collect(Collectors.toList());
  }
}
