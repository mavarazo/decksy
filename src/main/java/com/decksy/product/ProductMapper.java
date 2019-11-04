package com.decksy.product;

import com.decksy.domain.Product;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductMapper {

  @Select("select * from product where id=#{id}")
  Product findById(long id);

  @Insert(
      "insert into product"
          + "(last_modified, product_id, name, icon, expansion, rarity)"
          + " values "
          + "(#{last_modified}, #{product_id}, #{name}, #{icon}, #{expansion}, #{rarity})")
  @Options(useGeneratedKeys = true)
  void save(Product product);

  @Delete("delete from product where id=#{id}")
  void deleteById(long id);

  @Update(
      "update product set "
          + "last_modified=#{last_modified}, name=#{name}, icon=#{icon}, expansion=#{expansion}, rarity=#{rarity}"
          + " where "
          + "id=#{id}")
  void update(
      @Param("id") long id,
      @Param("last_modified") LocalDateTime last_modified,
      @Param("name") String name,
      @Param("icon") int icon,
      @Param("expansion") String expansion,
      @Param("rarity") String rarity);

  @Select("select * from product")
  List<Product> findAll();
}
