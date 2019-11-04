package com.decksy.article;

import com.decksy.domain.Article;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ArticleMapper {

  @Select("select * from article where id=#{id}")
  Article findById(long id);

  @Insert(
      "insert into article"
          + "(last_modified, product_id, article_id, count, language_id, comments, condition, isFoil, isSigned, isAltered, isPlayset)"
          + " values "
          + "(#{last_modified}, #{product_id}, #{article_id}, #{count}, #{language_id}, #{comments}, #{condition}, #{isFoil}, #{isSigned}, #{isAltered}, #{isPlayset})")
  @Options(useGeneratedKeys = true)
  void save(Article article);

  @Delete("delete from article where id=#{id}")
  void deleteById(long id);

  @Update(
      "update article set "
          + "last_modified=#{last_modified}, count=#{count}, language_id=#{language_id}, comments=#{comments}, condition=#{condition}, isFoil=#{isFoil}, isSigned=#{isSigned}, isAltered=#{isAltered}, isPlayset=#{isPlayset}"
          + " where "
          + "id=#{id}")
  void update(
      @Param("id") long id,
      @Param("last_modified") LocalDateTime last_modified,
      @Param("count") int count,
      @Param("language_id") long language_id,
      @Param("comments") String comments,
      @Param("isFoil") boolean isFoil,
      @Param("isSigned") boolean isSigned,
      @Param("isAltered") boolean isAltered,
      @Param("isPlayset") boolean isPlayset);

  @Select("select * from article")
  List<Article> findAll();
}
