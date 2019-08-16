package com.decksy.mapper;

import com.decksy.model.Type;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TypesMapper {

  public List<Type> toType(String[] types) {
    return Arrays.stream(types).map(t -> new Type().setType(t)).collect(Collectors.toList());
  }
}
