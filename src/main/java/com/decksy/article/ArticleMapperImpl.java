package com.decksy.article;

import com.decksy.domain.Article;
import java.time.LocalDateTime;
import java.util.List;
import javax.inject.Singleton;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

@Singleton
public class ArticleMapperImpl implements ArticleMapper {

  private final SqlSessionFactory sqlSessionFactory;

  public ArticleMapperImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  private ArticleMapper getMapper(SqlSession sqlSession) {
    return sqlSession.getMapper(ArticleMapper.class);
  }

  @Override
  public Article findById(long id) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return getMapper(sqlSession).findById(id);
    }
  }

  @Override
  public void save(Article article) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).save(article);
      sqlSession.commit();
    }
  }

  @Override
  public void deleteById(long id) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).deleteById(id);
      sqlSession.commit();
    }
  }

  @Override
  public void update(
      long id,
      LocalDateTime last_modified,
      int count,
      long language_id,
      String comments,
      boolean isFoil,
      boolean isSigned,
      boolean isAltered,
      boolean isPlayset) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession)
          .update(
              id,
              LocalDateTime.now(),
              count,
              language_id,
              comments,
              isFoil,
              isSigned,
              isAltered,
              isPlayset);
      sqlSession.commit();
    }
  }

  @Override
  public List<Article> findAll() {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return getMapper(sqlSession).findAll();
    }
  }
}
