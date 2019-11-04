package com.decksy.price;

import com.decksy.domain.Price;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PriceMapper {

  @Select("select * from price where id=#{id}")
  Price findById(long id);

  @Insert(
      "insert into price"
          + "(last_modified, article_id, price)"
          + " values "
          + "(#{last_modified}, #{article_id}, #{price})")
  @Options(useGeneratedKeys = true)
  void save(Price price);

  @Delete("delete from price where id=#{id}")
  void deleteById(long id);

  @Update(
      "update price set "
          + "last_modified=#{last_modified}, price=#{price}"
          + " where "
          + "id=#{id}")
  void update(
      @Param("id") long id,
      @Param("last_modified") LocalDateTime last_modified,
      @Param("price") BigDecimal price);

  @Select("select * from price")
  List<Price> findAll();
}
